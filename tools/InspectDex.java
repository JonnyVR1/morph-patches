import com.android.tools.smali.dexlib2.DexFileFactory;
import com.android.tools.smali.dexlib2.Opcode;
import com.android.tools.smali.dexlib2.Opcodes;
import com.android.tools.smali.dexlib2.iface.ClassDef;
import com.android.tools.smali.dexlib2.iface.Method;
import com.android.tools.smali.dexlib2.iface.MethodImplementation;
import com.android.tools.smali.dexlib2.iface.MultiDexContainer;
import com.android.tools.smali.dexlib2.iface.instruction.FiveRegisterInstruction;
import com.android.tools.smali.dexlib2.iface.instruction.Instruction;
import com.android.tools.smali.dexlib2.iface.instruction.NarrowLiteralInstruction;
import com.android.tools.smali.dexlib2.iface.instruction.OffsetInstruction;
import com.android.tools.smali.dexlib2.iface.instruction.OneRegisterInstruction;
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction;
import com.android.tools.smali.dexlib2.iface.instruction.RegisterRangeInstruction;
import com.android.tools.smali.dexlib2.iface.instruction.ThreeRegisterInstruction;
import com.android.tools.smali.dexlib2.iface.instruction.TwoRegisterInstruction;
import com.android.tools.smali.dexlib2.iface.instruction.WideLiteralInstruction;
import com.android.tools.smali.dexlib2.iface.reference.Reference;
import com.android.tools.smali.dexlib2.iface.reference.StringReference;
import com.android.tools.smali.dexlib2.util.ReferenceUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class InspectDex {

    static List<ClassDef> allClasses = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Usage: InspectDex <apk> <classDescriptor> [methodFilter] [maxInstr]");
            System.err.println("       InspectDex <apk> --find <constString> [maxHits]");
            System.err.println("       InspectDex <apk> --call <definingClass> [methodName] [maxHits]");
            System.err.println("       InspectDex <apk> --field <definingClass> <fieldName> [maxHits]");
            System.err.println("       InspectDex <apk> --list <classPrefix>");
            System.err.println("       InspectDex <apk> --full <classDescriptor> <methodName> [paramCount]");
            System.exit(2);
        }
        File apk = new File(args[0]);
        MultiDexContainer<? extends com.android.tools.smali.dexlib2.dexbacked.DexBackedDexFile> container =
                DexFileFactory.loadDexContainer(apk, Opcodes.getDefault());
        List<String> entryNames = container.getDexEntryNames();
        for (String name : entryNames) {
            MultiDexContainer.DexEntry<? extends com.android.tools.smali.dexlib2.dexbacked.DexBackedDexFile> entry = container.getEntry(name);
            for (ClassDef cd : entry.getDexFile().getClasses()) {
                allClasses.add(cd);
            }
        }
        System.err.println("Loaded " + allClasses.size() + " classes from " + entryNames.size() + " dex files");

        String mode = args[1];
        if (mode.equals("--find")) {
            findString(args[2], args.length > 3 ? Integer.parseInt(args[3]) : 40);
        } else if (mode.equals("--call")) {
            findCallers(args[2], args.length > 3 ? args[3] : null, args.length > 4 ? Integer.parseInt(args[4]) : 60);
        } else if (mode.equals("--field")) {
            findFieldRefs(args[2], args[3], args.length > 4 ? Integer.parseInt(args[4]) : 60);
        } else if (mode.equals("--list")) {
            for (ClassDef cd : allClasses) {
                if (cd.getType().startsWith(args[2])) System.out.println(cd.getType());
            }
        } else if (mode.equals("--full")) {
            String methodFilter = args.length > 3 ? args[3] : null;
            Integer paramCount = args.length > 4 ? Integer.parseInt(args[4]) : null;
            dumpClass(args[2], methodFilter, Integer.MAX_VALUE, paramCount);
        } else {
            String methodFilter = args.length > 2 && !args[2].isEmpty() ? args[2] : null;
            int maxInstr = args.length > 3 ? Integer.parseInt(args[3]) : 14;
            dumpClass(mode, methodFilter, maxInstr, null);
        }
    }

    static void findString(String needle, int maxHits) {
        int hits = 0;
        for (ClassDef cd : allClasses) {
            boolean classPrinted = false;
            for (Method m : cd.getMethods()) {
                MethodImplementation impl = m.getImplementation();
                if (impl == null) continue;
                int idx = 0;
                for (Instruction instr : impl.getInstructions()) {
                    if (instr instanceof ReferenceInstruction) {
                        Reference ref = ((ReferenceInstruction) instr).getReference();
                        if (ref instanceof StringReference && ((StringReference) ref).getString().contains(needle)) {
                            if (!classPrinted) {
                                System.out.println("CLASS " + cd.getType());
                                classPrinted = true;
                            }
                            System.out.println("  " + sig(m) + " [instr " + idx + "] \"" + ((StringReference) ref).getString() + "\"");
                            hits++;
                            if (hits >= maxHits) {
                                System.out.println("... hit cap reached");
                                return;
                            }
                        }
                    }
                    idx++;
                }
            }
        }
        System.out.println("Total hits: " + hits);
    }

    static void findCallers(String definingClass, String methodName, int maxHits) {
        int hits = 0;
        for (ClassDef cd : allClasses) {
            boolean classPrinted = false;
            for (Method m : cd.getMethods()) {
                MethodImplementation impl = m.getImplementation();
                if (impl == null) continue;
                for (Instruction instr : impl.getInstructions()) {
                    if (instr instanceof ReferenceInstruction) {
                        Reference ref = ((ReferenceInstruction) instr).getReference();
                        if (ref instanceof com.android.tools.smali.dexlib2.iface.reference.MethodReference) {
                            com.android.tools.smali.dexlib2.iface.reference.MethodReference mr =
                                    (com.android.tools.smali.dexlib2.iface.reference.MethodReference) ref;
                            if (mr.getDefiningClass().equals(definingClass) && (methodName == null || mr.getName().equals(methodName))) {
                                if (!classPrinted) {
                                    System.out.println("CLASS " + cd.getType());
                                    classPrinted = true;
                                }
                                System.out.println("  " + sig(m) + " calls " + ReferenceUtil.getReferenceString(ref));
                                hits++;
                                if (hits >= maxHits) {
                                    System.out.println("... hit cap reached");
                                    return;
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Total caller methods: " + hits);
    }

    static void findFieldRefs(String definingClass, String fieldName, int maxHits) {
        int hits = 0;
        for (ClassDef cd : allClasses) {
            boolean classPrinted = false;
            for (Method m : cd.getMethods()) {
                MethodImplementation impl = m.getImplementation();
                if (impl == null) continue;
                for (Instruction instr : impl.getInstructions()) {
                    if (instr instanceof ReferenceInstruction) {
                        Reference ref = ((ReferenceInstruction) instr).getReference();
                        if (ref instanceof com.android.tools.smali.dexlib2.iface.reference.FieldReference) {
                            com.android.tools.smali.dexlib2.iface.reference.FieldReference fr =
                                    (com.android.tools.smali.dexlib2.iface.reference.FieldReference) ref;
                            if (fr.getDefiningClass().equals(definingClass) && fr.getName().equals(fieldName)) {
                                if (!classPrinted) {
                                    System.out.println("CLASS " + cd.getType());
                                    classPrinted = true;
                                }
                                System.out.println("  " + sig(m) + " refs " + ReferenceUtil.getReferenceString(ref));
                                hits++;
                                if (hits >= maxHits) {
                                    System.out.println("... hit cap reached");
                                    return;
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Total field-ref methods: " + hits);
    }

    static void dumpClass(String type, String methodFilter, int maxInstr, Integer paramCount) {
        boolean found = false;
        for (ClassDef cd : allClasses) {
            if (!cd.getType().equals(type)) continue;
            found = true;
            System.out.println("CLASS " + cd.getType() + " extends " + cd.getSuperclass() + " flags=0x" + Integer.toHexString(cd.getAccessFlags()));
            for (Method m : cd.getMethods()) {
                if (methodFilter != null && !m.getName().contains(methodFilter)) continue;
                if (paramCount != null && m.getParameterTypes().size() != paramCount) continue;
                MethodImplementation impl = m.getImplementation();
                System.out.println("  METHOD " + sig(m) + " flags=0x" + Integer.toHexString(m.getAccessFlags())
                        + " regs=" + (impl == null ? -1 : impl.getRegisterCount()));
                if (impl == null) continue;
                int idx = 0;
                for (Instruction instr : impl.getInstructions()) {
                    if (idx >= maxInstr) {
                        System.out.println("    ... (" + countInstructions(impl) + " instructions total)");
                        break;
                    }
                    System.out.println("    [" + idx + "] " + format(instr));
                    idx++;
                }
            }
        }
        if (!found) System.out.println("CLASS NOT FOUND: " + type);
    }

    static int countInstructions(MethodImplementation impl) {
        int n = 0;
        for (Instruction ignored : impl.getInstructions()) n++;
        return n;
    }

    static String sig(Method m) {
        StringBuilder sb = new StringBuilder();
        sb.append(m.getName()).append('(');
        for (CharSequence p : m.getParameterTypes()) sb.append(p).append(',');
        sb.append(')').append(m.getReturnType());
        return sb.toString();
    }

    static String format(Instruction instr) {
        StringBuilder sb = new StringBuilder(instr.getOpcode().name);
        if (instr instanceof OneRegisterInstruction) {
            sb.append(" v").append(((OneRegisterInstruction) instr).getRegisterA());
        }
        if (instr instanceof TwoRegisterInstruction) {
            sb.append(", v").append(((TwoRegisterInstruction) instr).getRegisterB());
        }
        if (instr instanceof ThreeRegisterInstruction) {
            sb.append(", v").append(((ThreeRegisterInstruction) instr).getRegisterC());
        }
        if (instr instanceof FiveRegisterInstruction) {
            FiveRegisterInstruction five = (FiveRegisterInstruction) instr;
            int[] regs = {five.getRegisterC(), five.getRegisterD(), five.getRegisterE(), five.getRegisterF(), five.getRegisterG()};
            sb.append(" {");
            for (int i = 0; i < five.getRegisterCount(); i++) {
                if (i > 0) sb.append(", ");
                sb.append('v').append(regs[i]);
            }
            sb.append('}');
        }
        if (instr instanceof RegisterRangeInstruction) {
            RegisterRangeInstruction range = (RegisterRangeInstruction) instr;
            sb.append(" {v").append(range.getStartRegister()).append(" .. v").append(range.getStartRegister() + range.getRegisterCount() - 1).append('}');
        }
        if (instr instanceof ReferenceInstruction) {
            Reference ref = ((ReferenceInstruction) instr).getReference();
            sb.append(", ").append(ReferenceUtil.getReferenceString(ref));
        }
        if (instr instanceof NarrowLiteralInstruction) {
            sb.append(", 0x").append(Integer.toHexString(((NarrowLiteralInstruction) instr).getNarrowLiteral()));
        } else if (instr instanceof WideLiteralInstruction) {
            sb.append(", 0x").append(Long.toHexString(((WideLiteralInstruction) instr).getWideLiteral()));
        }
        if (instr instanceof OffsetInstruction) {
            sb.append(" -> +").append(((OffsetInstruction) instr).getCodeOffset());
        }
        return sb.toString();
    }
}

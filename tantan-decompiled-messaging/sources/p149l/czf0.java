package p149l;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class czf0 implements rze<InputStream> {

    /* JADX INFO: renamed from: a */
    private final h01 f83082a;

    public czf0(h01 h01Var) {
        this.f83082a = h01Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.czf0] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.czf0] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p149l.rze
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo98228a(@NonNull InputStream inputStream, @NonNull File file, @NonNull px50 px50Var) throws Throwable {
        byte[] bArr = (byte[]) this.f83082a.mo128942c(65536, byte[].class);
        boolean z = false;
        ?? r1 = 0;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        r1 = -1;
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException unused) {
                        fileOutputStream = fileOutputStream2;
                        Log.isLoggable("StreamEncoder", 3);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        h01 h01Var = this.f83082a;
                        h01Var.put(bArr);
                        r1 = fileOutputStream;
                        this = h01Var;
                    } catch (Throwable th) {
                        th = th;
                        r1 = fileOutputStream2;
                        if (r1 != 0) {
                            try {
                                r1.close();
                            } catch (IOException unused3) {
                            }
                        }
                        this.f83082a.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused4) {
                }
                h01 h01Var2 = this.f83082a;
                h01Var2.put(bArr);
                z = true;
                this = h01Var2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused5) {
        }
        return z;
    }
}

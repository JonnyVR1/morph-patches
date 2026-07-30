package p153l;

import android.text.TextUtils;
import com.tantanapp.engine.EngineType;
import com.tantanapp.engine.FunctionResultType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: classes11.dex */
public class a2f {

    /* JADX INFO: renamed from: a */
    public HashMap<String, dk2> f67982a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public HashMap<String, m1l0> f67983b = new HashMap<>();

    /* JADX INFO: renamed from: l.a2f$a */
    public static /* synthetic */ class C15626a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f67984a;

        static {
            int[] iArr = new int[FunctionResultType.values().length];
            f67984a = iArr;
            try {
                iArr[FunctionResultType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67984a[FunctionResultType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67984a[FunctionResultType.List.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m95659a(List<Object> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            y1f y1fVar = new y1f();
            y1fVar.f197094a = z ? EngineType.String : EngineType.Number;
            y1fVar.f197095b = obj;
            arrayList.add(y1fVar);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final y1f m95660b(String str, y1f y1fVar, ArrayList<y1f> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            if (str.startsWith("\"")) {
                y1fVar.f197094a = EngineType.String;
                y1fVar.f197095b = str.replaceAll("\"", "");
                return y1fVar;
            }
            try {
                Double dValueOf = Double.valueOf(str);
                y1fVar.f197094a = EngineType.Number;
                y1fVar.f197095b = dValueOf;
                return y1fVar;
            } catch (NumberFormatException unused) {
                y1fVar.f197095b = str;
                y1fVar.f197094a = this.f67982a.containsKey(str) ? EngineType.Function : EngineType.Key;
                return y1fVar;
            }
        }
        y1f y1fVar2 = arrayList.get(0);
        y1fVar.f197095b = arrayList;
        EngineType engineType = y1fVar2.f197094a;
        if (engineType == EngineType.String) {
            y1fVar.f197094a = EngineType.StringParamsList;
            return y1fVar;
        }
        if (engineType == EngineType.Number) {
            y1fVar.f197094a = EngineType.NumberParamsList;
            return y1fVar;
        }
        y1fVar.f197094a = EngineType.NestedList;
        return y1fVar;
    }

    /* JADX INFO: renamed from: c */
    public y1f m95661c(y1f y1fVar) throws Exception {
        if (y1fVar == null) {
            brq0.m106161a("doFunction mode is null");
            return null;
        }
        if (y1fVar.f197094a != EngineType.NestedList) {
            brq0.m106161a("doFunction mode type is not NestedList");
            return null;
        }
        ArrayList arrayList = (ArrayList) y1fVar.f197095b;
        y1f y1fVar2 = (y1f) arrayList.get(0);
        if (y1fVar2.f197094a != EngineType.Function) {
            throw new Exception("doFunction mode type is not function: type = " + y1fVar2.f197094a);
        }
        dk2 dk2Var = this.f67982a.get((String) y1fVar2.f197095b);
        if (dk2Var == null) {
            throw new Exception("doFunction function is not exits: err_function = " + ((String) y1fVar2.f197095b));
        }
        y1f[] y1fVarArr = new y1f[arrayList.size() - 1];
        for (int i = 1; i < arrayList.size(); i++) {
            y1f y1fVar3 = (y1f) arrayList.get(i);
            EngineType engineType = y1fVar3.f197094a;
            if (engineType == EngineType.Key) {
                y1fVarArr[i - 1] = m95662d((String) y1fVar3.f197095b);
            } else if (engineType == EngineType.NestedList) {
                y1fVarArr[i - 1] = m95661c(y1fVar3);
            } else {
                y1fVarArr[i - 1] = y1fVar3;
            }
        }
        y1f y1fVar4 = new y1f();
        y1fVar4.f197094a = m95664f(dk2Var.mo116189d(), y1fVarArr[0]);
        y1fVar4.f197095b = dk2Var.mo116186a(y1fVarArr);
        return y1fVar4;
    }

    /* JADX INFO: renamed from: d */
    public final y1f m95662d(String str) throws Exception {
        y1f y1fVar = new y1f();
        m1l0 m1l0Var = this.f67983b.get(str);
        if (m1l0Var == null) {
            throw new Exception("variable is not fount err_key = " + str);
        }
        Object objMo99439a = m1l0Var.mo99439a();
        if (objMo99439a instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) objMo99439a;
            if (arrayList.size() > 0) {
                if (arrayList.get(0) instanceof String) {
                    y1fVar.f197094a = EngineType.StringParamsList;
                } else {
                    y1fVar.f197094a = EngineType.NumberParamsList;
                }
                objMo99439a = m95659a(arrayList, y1fVar.f197094a == EngineType.StringParamsList);
            }
        } else if ((objMo99439a instanceof Integer) || (objMo99439a instanceof Long) || (objMo99439a instanceof Float) || (objMo99439a instanceof Double) || (objMo99439a instanceof Byte)) {
            y1fVar.f197094a = EngineType.Number;
        } else if (objMo99439a instanceof Boolean) {
            y1fVar.f197094a = EngineType.Boolean;
        } else {
            y1fVar.f197094a = EngineType.String;
        }
        y1fVar.f197095b = objMo99439a;
        return y1fVar;
    }

    /* JADX INFO: renamed from: e */
    public y1f m95663e(String str) {
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        y1f y1fVar = null;
        boolean z = false;
        for (char c : charArray) {
            if (c == '\n' || c == ' ') {
                if (z) {
                    arrayList.add(Character.valueOf(c));
                } else if (arrayList.size() > 0) {
                    ((ArrayList) stack2.lastElement()).add(m95660b(b2f.m102142a(arrayList), new y1f(), null));
                    arrayList.clear();
                }
            } else if (c == '\"') {
                z = !z;
                arrayList.add(Character.valueOf(c));
            } else if (c != '(') {
                if (c != ')') {
                    arrayList.add(Character.valueOf(c));
                } else if (z) {
                    arrayList.add(Character.valueOf(c));
                } else {
                    if (arrayList.size() > 0) {
                        ((ArrayList) stack2.lastElement()).add(m95660b(b2f.m102142a(arrayList), new y1f(), null));
                    }
                    y1f y1fVar2 = (y1f) stack.pop();
                    m95660b("", y1fVar2, (ArrayList) stack2.pop());
                    arrayList.clear();
                    if (stack.size() > 0) {
                        ((ArrayList) stack2.lastElement()).add(y1fVar2);
                    } else {
                        y1fVar = y1fVar2;
                    }
                }
            } else if (z) {
                arrayList.add(Character.valueOf(c));
            } else {
                stack.add(new y1f());
                stack2.add(new ArrayList());
            }
        }
        return y1fVar;
    }

    /* JADX INFO: renamed from: f */
    public final EngineType m95664f(FunctionResultType functionResultType, y1f y1fVar) {
        int i = C15626a.f67984a[functionResultType.ordinal()];
        if (i == 1) {
            return EngineType.Number;
        }
        if (i == 2) {
            return EngineType.Boolean;
        }
        if (i == 3) {
            EngineType engineType = y1fVar.f197094a;
            if (engineType == EngineType.String) {
                return EngineType.StringParamsList;
            }
            if (engineType == EngineType.Number) {
                return EngineType.NumberParamsList;
            }
        }
        return EngineType.String;
    }

    /* JADX INFO: renamed from: g */
    public void m95665g(dk2... dk2VarArr) {
        for (dk2 dk2Var : dk2VarArr) {
            if (this.f67982a.containsKey(dk2Var.mo116188c())) {
                zzq0.m222278a("function :", dk2Var.mo116188c(), "is already exist");
                return;
            }
            this.f67982a.put(dk2Var.mo116188c(), dk2Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m95666h(m1l0... m1l0VarArr) {
        for (m1l0 m1l0Var : m1l0VarArr) {
            if (this.f67983b.containsKey(m1l0Var.key())) {
                zzq0.m222278a("field :", m1l0Var.key(), "is already exist");
                return;
            }
            this.f67983b.put(m1l0Var.key(), m1l0Var);
        }
    }
}

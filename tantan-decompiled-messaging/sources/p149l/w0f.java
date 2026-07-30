package p149l;

import android.text.TextUtils;
import com.tantanapp.engine.EngineType;
import com.tantanapp.engine.FunctionResultType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: classes13.dex */
public class w0f {

    /* JADX INFO: renamed from: a */
    public HashMap<String, vj2> f183912a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public HashMap<String, gsk0> f183913b = new HashMap<>();

    /* JADX INFO: renamed from: l.w0f$a */
    public static /* synthetic */ class C20782a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f183914a;

        static {
            int[] iArr = new int[FunctionResultType.values().length];
            f183914a = iArr;
            try {
                iArr[FunctionResultType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f183914a[FunctionResultType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f183914a[FunctionResultType.List.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m200859a(List<Object> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            u0f u0fVar = new u0f();
            u0fVar.f172902a = z ? EngineType.String : EngineType.Number;
            u0fVar.f172903b = obj;
            arrayList.add(u0fVar);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final u0f m200860b(String str, u0f u0fVar, ArrayList<u0f> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            if (str.startsWith("\"")) {
                u0fVar.f172902a = EngineType.String;
                u0fVar.f172903b = str.replaceAll("\"", "");
                return u0fVar;
            }
            try {
                Double dValueOf = Double.valueOf(str);
                u0fVar.f172902a = EngineType.Number;
                u0fVar.f172903b = dValueOf;
                return u0fVar;
            } catch (NumberFormatException unused) {
                u0fVar.f172903b = str;
                u0fVar.f172902a = this.f183912a.containsKey(str) ? EngineType.Function : EngineType.Key;
                return u0fVar;
            }
        }
        u0f u0fVar2 = arrayList.get(0);
        u0fVar.f172903b = arrayList;
        EngineType engineType = u0fVar2.f172902a;
        if (engineType == EngineType.String) {
            u0fVar.f172902a = EngineType.StringParamsList;
            return u0fVar;
        }
        if (engineType == EngineType.Number) {
            u0fVar.f172902a = EngineType.NumberParamsList;
            return u0fVar;
        }
        u0fVar.f172902a = EngineType.NestedList;
        return u0fVar;
    }

    /* JADX INFO: renamed from: c */
    public u0f m200861c(u0f u0fVar) throws Exception {
        if (u0fVar == null) {
            whq0.m203241a("doFunction mode is null");
            return null;
        }
        if (u0fVar.f172902a != EngineType.NestedList) {
            whq0.m203241a("doFunction mode type is not NestedList");
            return null;
        }
        ArrayList arrayList = (ArrayList) u0fVar.f172903b;
        u0f u0fVar2 = (u0f) arrayList.get(0);
        if (u0fVar2.f172902a != EngineType.Function) {
            throw new Exception("doFunction mode type is not function: type = " + u0fVar2.f172902a);
        }
        vj2 vj2Var = this.f183912a.get((String) u0fVar2.f172903b);
        if (vj2Var == null) {
            throw new Exception("doFunction function is not exits: err_function = " + ((String) u0fVar2.f172903b));
        }
        u0f[] u0fVarArr = new u0f[arrayList.size() - 1];
        for (int i = 1; i < arrayList.size(); i++) {
            u0f u0fVar3 = (u0f) arrayList.get(i);
            EngineType engineType = u0fVar3.f172902a;
            if (engineType == EngineType.Key) {
                u0fVarArr[i - 1] = m200862d((String) u0fVar3.f172903b);
            } else if (engineType == EngineType.NestedList) {
                u0fVarArr[i - 1] = m200861c(u0fVar3);
            } else {
                u0fVarArr[i - 1] = u0fVar3;
            }
        }
        u0f u0fVar4 = new u0f();
        u0fVar4.f172902a = m200864f(vj2Var.mo100036d(), u0fVarArr[0]);
        u0fVar4.f172903b = vj2Var.mo100034a(u0fVarArr);
        return u0fVar4;
    }

    /* JADX INFO: renamed from: d */
    public final u0f m200862d(String str) throws Exception {
        u0f u0fVar = new u0f();
        gsk0 gsk0Var = this.f183913b.get(str);
        if (gsk0Var == null) {
            throw new Exception("variable is not fount err_key = " + str);
        }
        Object objMo127805a = gsk0Var.mo127805a();
        if (objMo127805a instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) objMo127805a;
            if (arrayList.size() > 0) {
                if (arrayList.get(0) instanceof String) {
                    u0fVar.f172902a = EngineType.StringParamsList;
                } else {
                    u0fVar.f172902a = EngineType.NumberParamsList;
                }
                objMo127805a = m200859a(arrayList, u0fVar.f172902a == EngineType.StringParamsList);
            }
        } else if ((objMo127805a instanceof Integer) || (objMo127805a instanceof Long) || (objMo127805a instanceof Float) || (objMo127805a instanceof Double) || (objMo127805a instanceof Byte)) {
            u0fVar.f172902a = EngineType.Number;
        } else if (objMo127805a instanceof Boolean) {
            u0fVar.f172902a = EngineType.Boolean;
        } else {
            u0fVar.f172902a = EngineType.String;
        }
        u0fVar.f172903b = objMo127805a;
        return u0fVar;
    }

    /* JADX INFO: renamed from: e */
    public u0f m200863e(String str) {
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        u0f u0fVar = null;
        boolean z = false;
        for (char c : charArray) {
            if (c == '\n' || c == ' ') {
                if (z) {
                    arrayList.add(Character.valueOf(c));
                } else if (arrayList.size() > 0) {
                    ((ArrayList) stack2.lastElement()).add(m200860b(x0f.m206610a(arrayList), new u0f(), null));
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
                        ((ArrayList) stack2.lastElement()).add(m200860b(x0f.m206610a(arrayList), new u0f(), null));
                    }
                    u0f u0fVar2 = (u0f) stack.pop();
                    m200860b("", u0fVar2, (ArrayList) stack2.pop());
                    arrayList.clear();
                    if (stack.size() > 0) {
                        ((ArrayList) stack2.lastElement()).add(u0fVar2);
                    } else {
                        u0fVar = u0fVar2;
                    }
                }
            } else if (z) {
                arrayList.add(Character.valueOf(c));
            } else {
                stack.add(new u0f());
                stack2.add(new ArrayList());
            }
        }
        return u0fVar;
    }

    /* JADX INFO: renamed from: f */
    public final EngineType m200864f(FunctionResultType functionResultType, u0f u0fVar) {
        int i = C20782a.f183914a[functionResultType.ordinal()];
        if (i == 1) {
            return EngineType.Number;
        }
        if (i == 2) {
            return EngineType.Boolean;
        }
        if (i == 3) {
            EngineType engineType = u0fVar.f172902a;
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
    public void m200865g(vj2... vj2VarArr) {
        for (vj2 vj2Var : vj2VarArr) {
            if (this.f183912a.containsKey(vj2Var.mo100035c())) {
                tqq0.m190155a("function :", vj2Var.mo100035c(), "is already exist");
                return;
            }
            this.f183912a.put(vj2Var.mo100035c(), vj2Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m200866h(gsk0... gsk0VarArr) {
        for (gsk0 gsk0Var : gsk0VarArr) {
            if (this.f183913b.containsKey(gsk0Var.key())) {
                tqq0.m190155a("field :", gsk0Var.key(), "is already exist");
                return;
            }
            this.f183913b.put(gsk0Var.key(), gsk0Var);
        }
    }
}

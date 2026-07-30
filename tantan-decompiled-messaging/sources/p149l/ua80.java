package p149l;

import com.facebook.imagepipeline.memory.AbstractC1619b;
import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.C1618a;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class ua80 {

    /* JADX INFO: renamed from: a */
    public final sa80 f175573a;

    /* JADX INFO: renamed from: b */
    public AbstractC1619b f175574b;

    /* JADX INFO: renamed from: c */
    public f23 f175575c;

    /* JADX INFO: renamed from: d */
    public AbstractC1619b f175576d;

    /* JADX INFO: renamed from: e */
    public zpi f175577e;

    /* JADX INFO: renamed from: f */
    public AbstractC1619b f175578f;

    /* JADX INFO: renamed from: g */
    public za80 f175579g;

    /* JADX INFO: renamed from: h */
    public cb80 f175580h;

    /* JADX INFO: renamed from: i */
    public wp3 f175581i;

    public ua80(sa80 sa80Var) {
        this.f175573a = (sa80) rf80.m179116g(sa80Var);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1619b m192736a() {
        if (this.f175574b == null) {
            try {
                this.f175574b = (AbstractC1619b) AshmemMemoryChunkPool.class.getConstructor(jhy.class, va80.class, wa80.class).newInstance(this.f175573a.m182865i(), this.f175573a.m182863g(), this.f175573a.m182864h());
            } catch (ClassNotFoundException unused) {
                this.f175574b = null;
            } catch (IllegalAccessException unused2) {
                this.f175574b = null;
            } catch (InstantiationException unused3) {
                this.f175574b = null;
            } catch (NoSuchMethodException unused4) {
                this.f175574b = null;
            } catch (InvocationTargetException unused5) {
                this.f175574b = null;
            }
        }
        return this.f175574b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    /* JADX INFO: renamed from: b */
    public f23 m192737b() {
        if (this.f175575c == null) {
            String strM182861e = this.f175573a.m182861e();
            switch (strM182861e.hashCode()) {
                case -1868884870:
                    if (!strM182861e.equals("legacy_default_params")) {
                        this.f175575c = new eg3(this.f175573a.m182865i(), this.f175573a.m182859c(), this.f175573a.m182860d(), this.f175573a.m182868l());
                    } else {
                        this.f175575c = new eg3(this.f175573a.m182865i(), nld.m160018a(), this.f175573a.m182860d(), this.f175573a.m182868l());
                    }
                    break;
                case -1106578487:
                    strM182861e.equals("legacy");
                    this.f175575c = new eg3(this.f175573a.m182865i(), this.f175573a.m182859c(), this.f175573a.m182860d(), this.f175573a.m182868l());
                    break;
                case -404562712:
                    if (!strM182861e.equals("experimental")) {
                        this.f175575c = new eg3(this.f175573a.m182865i(), this.f175573a.m182859c(), this.f175573a.m182860d(), this.f175573a.m182868l());
                    } else {
                        this.f175575c = new wew(this.f175573a.m182858b(), this.f175573a.m182857a(), tk40.m189423h(), this.f175573a.m182869m() ? this.f175573a.m182865i() : null);
                    }
                    break;
                case -402149703:
                    if (!strM182861e.equals("dummy_with_tracking")) {
                        this.f175575c = new eg3(this.f175573a.m182865i(), this.f175573a.m182859c(), this.f175573a.m182860d(), this.f175573a.m182868l());
                    } else {
                        this.f175575c = new oee();
                    }
                    break;
                case 95945896:
                    if (!strM182861e.equals("dummy")) {
                        this.f175575c = new eg3(this.f175573a.m182865i(), this.f175573a.m182859c(), this.f175573a.m182860d(), this.f175573a.m182868l());
                    } else {
                        this.f175575c = new lee();
                    }
                    break;
                default:
                    this.f175575c = new eg3(this.f175573a.m182865i(), this.f175573a.m182859c(), this.f175573a.m182860d(), this.f175573a.m182868l());
                    break;
            }
        }
        return this.f175575c;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC1619b m192738c() {
        if (this.f175576d == null) {
            try {
                this.f175576d = (AbstractC1619b) BufferMemoryChunkPool.class.getConstructor(jhy.class, va80.class, wa80.class).newInstance(this.f175573a.m182865i(), this.f175573a.m182863g(), this.f175573a.m182864h());
            } catch (ClassNotFoundException unused) {
                this.f175576d = null;
            } catch (IllegalAccessException unused2) {
                this.f175576d = null;
            } catch (InstantiationException unused3) {
                this.f175576d = null;
            } catch (NoSuchMethodException unused4) {
                this.f175576d = null;
            } catch (InvocationTargetException unused5) {
                this.f175576d = null;
            }
        }
        return this.f175576d;
    }

    /* JADX INFO: renamed from: d */
    public zpi m192739d() {
        if (this.f175577e == null) {
            this.f175577e = new zpi(this.f175573a.m182865i(), this.f175573a.m182862f());
        }
        return this.f175577e;
    }

    /* JADX INFO: renamed from: e */
    public int m192740e() {
        return this.f175573a.m182862f().f180722g;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC1619b m192741f(int i) {
        if (i == 0) {
            return m192742g();
        }
        if (i == 1) {
            return m192738c();
        }
        if (i == 2) {
            return m192736a();
        }
        ig3.m135964a("Invalid MemoryChunkType");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public AbstractC1619b m192742g() {
        if (this.f175578f == null) {
            try {
                this.f175578f = (AbstractC1619b) NativeMemoryChunkPool.class.getConstructor(jhy.class, va80.class, wa80.class).newInstance(this.f175573a.m182865i(), this.f175573a.m182863g(), this.f175573a.m182864h());
            } catch (ClassNotFoundException e) {
                tsf.m190543i("PoolFactory", "", e);
                this.f175578f = null;
            } catch (IllegalAccessException e2) {
                tsf.m190543i("PoolFactory", "", e2);
                this.f175578f = null;
            } catch (InstantiationException e3) {
                tsf.m190543i("PoolFactory", "", e3);
                this.f175578f = null;
            } catch (NoSuchMethodException e4) {
                tsf.m190543i("PoolFactory", "", e4);
                this.f175578f = null;
            } catch (InvocationTargetException e5) {
                tsf.m190543i("PoolFactory", "", e5);
                this.f175578f = null;
            }
        }
        return this.f175578f;
    }

    /* JADX INFO: renamed from: h */
    public za80 m192743h() {
        return m192744i(!a620.m95107a() ? 1 : 0);
    }

    /* JADX INFO: renamed from: i */
    public za80 m192744i(int i) {
        if (this.f175579g == null) {
            AbstractC1619b abstractC1619bM192741f = m192741f(i);
            rf80.m179117h(abstractC1619bM192741f, "failed to get pool for chunk type: " + i);
            this.f175579g = new dhy(abstractC1619bM192741f, m192745j());
        }
        return this.f175579g;
    }

    /* JADX INFO: renamed from: j */
    public cb80 m192745j() {
        if (this.f175580h == null) {
            this.f175580h = new cb80(m192746k());
        }
        return this.f175580h;
    }

    /* JADX INFO: renamed from: k */
    public wp3 m192746k() {
        if (this.f175581i == null) {
            this.f175581i = new C1618a(this.f175573a.m182865i(), this.f175573a.m182866j(), this.f175573a.m182867k());
        }
        return this.f175581i;
    }
}

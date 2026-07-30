package p007l;

import android.text.TextUtils;
import l.aw00;
import l.bw00;
import l.dxl;
import l.ewl;
import l.n8c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class cw00 extends aw00 implements dxl {

    /* JADX INFO: renamed from: K */
    protected String f2488K;

    /* JADX INFO: renamed from: L */
    protected String f2489L;

    /* JADX INFO: renamed from: M */
    protected String f2490M;

    /* JADX INFO: renamed from: N */
    protected String f2491N;

    /* JADX INFO: renamed from: O */
    protected String f2492O;

    /* JADX INFO: renamed from: P */
    protected String f2493P;

    /* JADX INFO: renamed from: Q */
    protected String f2494Q;

    /* JADX INFO: renamed from: R */
    private String f2495R;

    /* JADX INFO: renamed from: S */
    private String f2496S;

    /* JADX INFO: renamed from: T */
    private String f2497T;

    /* JADX INFO: renamed from: U */
    private String f2498U;

    /* JADX INFO: renamed from: V */
    private String f2499V;

    /* JADX INFO: renamed from: W */
    private String f2500W;

    /* JADX INFO: renamed from: X */
    private String f2501X;

    /* JADX INFO: renamed from: Y */
    private String f2502Y;

    /* JADX INFO: renamed from: Z */
    long f2503Z;

    public cw00(String str) {
        super(str);
        this.f2488K = "v2.bitRateAdaptStart";
        this.f2489L = "v2.bitRateAdaptStop";
        this.f2490M = "v2.conferenceStart";
        this.f2491N = "v2.conferenceStop";
        this.f2492O = "v2.pushBufferStart";
        this.f2493P = "v2.pushBufferStop";
        this.f2494Q = "v2.pushFilter";
        this.f2495R = "v2.pushLevelChange";
        this.f2496S = "v2.pushDropStart";
        this.f2497T = "v2.pushDropStop";
        this.f2498U = "v2.quicAgentStart";
        this.f2499V = "v2.quicAgentConnected";
        this.f2500W = "v2.quicAgentWatch";
        this.f2501X = "v2.quicAgentStop";
        this.f2502Y = "v2.quicAgentClosed";
        ((bw00) this).a = "v2.pushWatch";
        ((bw00) this).c = "v2.pushStart";
        ((bw00) this).d = "v2.pushStop";
        ((bw00) this).e = "v2.pushBitrateChange";
    }

    /* JADX INFO: renamed from: u */
    private String m8806u(Object obj, int i) {
        n8c.a("zhengjijian", "logLinkedRenderAndStop [" + obj.toString() + "] " + i + "/" + ((bw00) this).l);
        if (!e(obj) || !((bw00) this).l.equals(obj.toString())) {
            return "";
        }
        String strG1 = ((ewl) obj).g1(4105, i, (Object) null);
        return "{" + System.currentTimeMillis() + "," + strG1 + "}";
    }

    /* JADX INFO: renamed from: x */
    private String m8807x(Object obj, boolean z) {
        if (m8814q() != 0 || !e(obj) || !((bw00) this).l.equals(obj.toString()) || !(obj instanceof kw00)) {
            return "";
        }
        kw00 kw00Var = (kw00) obj;
        int iM9713J0 = (int) kw00Var.m9713J0();
        int iM9735X0 = (int) kw00Var.m9735X0();
        int iM9781u1 = (int) kw00Var.m9781u1();
        int iM9702D0 = (int) kw00Var.m9702D0();
        int iM9744b4 = kw00Var.m9744b4();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!z) {
            return "{" + jCurrentTimeMillis + "," + iM9713J0 + "," + iM9735X0 + "," + iM9781u1 + "," + iM9702D0 + "}";
        }
        return "{" + jCurrentTimeMillis + "," + iM9713J0 + "," + iM9735X0 + "," + iM9781u1 + "," + iM9702D0 + "," + iM9744b4 + "}";
    }

    /* JADX INFO: renamed from: y */
    private String m8808y(Object obj, String str) {
        if (!e(obj) || !((bw00) this).l.equals(obj.toString())) {
            return "";
        }
        ewl ewlVar = (ewl) obj;
        int iJ0 = (int) ewlVar.J0();
        int iX0 = (int) ewlVar.X0();
        int iU1 = (int) ewlVar.u1();
        int iD0 = (int) ewlVar.D0();
        String strG1 = ewlVar.g1(4103, 0, (Object) null);
        return "{" + System.currentTimeMillis() + "," + iJ0 + "," + iX0 + "," + iU1 + "," + iD0 + "," + str + "," + strG1 + "}";
    }

    /* JADX INFO: renamed from: A */
    public String m8809A(Object obj, int i) {
        return super.m(obj, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    /* JADX INFO: renamed from: a */
    public void m8810a(int i, int i2, Object obj) {
        String strM8818v;
        String str;
        String str2;
        String strM8808y;
        String str3;
        super.a(i, i2, obj);
        if (i == 4099) {
            strM8818v = m8818v(obj);
            str = this.f2492O;
            String str4 = strM8818v;
            str2 = str;
            strM8808y = str4;
        } else if (i == 4100) {
            strM8818v = m8819w(obj);
            str = this.f2493P;
            String str5 = strM8818v;
            str2 = str;
            strM8808y = str5;
        } else if (i == 8194) {
            strM8818v = m8818v(obj);
            str = this.f2492O;
            String str6 = strM8818v;
            str2 = str;
            strM8808y = str6;
        } else if (i != 8195) {
            str2 = "";
            switch (i) {
                case 8197:
                    if (i2 == 1) {
                        str3 = "down";
                    } else {
                        str3 = "up";
                    }
                    strM8808y = m8808y(obj, str3);
                    str2 = TextUtils.isEmpty(strM8808y) ? "" : this.f2495R;
                    n8c.a("PushLevelChange", "DYNAMIC_SCALING " + strM8808y);
                    break;
                case 8198:
                    strM8808y = m8806u(obj, i2);
                    str2 = TextUtils.isEmpty(strM8808y) ? "" : "v2.confRenderStart";
                    n8c.a("zhengjijian", "linked_render confRenderStart " + i2 + "/" + strM8808y);
                    break;
                case 8199:
                    strM8808y = m8806u(obj, i2);
                    str2 = TextUtils.isEmpty(strM8808y) ? "" : "v2.confRenderStop";
                    n8c.a("zhengjijian", "linked_render confRenderStop " + i2 + "/" + strM8808y);
                    break;
                default:
                    switch (i) {
                        case 12293:
                            strM8818v = m8816r(obj);
                            str = this.f2488K;
                            String str7 = strM8818v;
                            str2 = str;
                            strM8808y = str7;
                            break;
                        case 12294:
                            strM8818v = m8817s(obj);
                            str = this.f2489L;
                            String str8 = strM8818v;
                            str2 = str;
                            strM8808y = str8;
                            break;
                        case 12295:
                            strM8818v = m8818v(obj);
                            str = this.f2492O;
                            String str9 = strM8818v;
                            str2 = str;
                            strM8808y = str9;
                            break;
                        case 12296:
                            strM8818v = m8819w(obj);
                            str = this.f2493P;
                            String str10 = strM8818v;
                            str2 = str;
                            strM8808y = str10;
                            break;
                        default:
                            switch (i) {
                                case 12300:
                                    strM8808y = m8807x(obj, false);
                                    if (!TextUtils.isEmpty(strM8808y)) {
                                        str2 = this.f2496S;
                                    }
                                    break;
                                case 12301:
                                    strM8808y = m8807x(obj, true);
                                    if (!TextUtils.isEmpty(strM8808y)) {
                                        str2 = this.f2497T;
                                    }
                                    break;
                                case 12302:
                                    if (i2 == 1) {
                                        str3 = "down";
                                    } else {
                                        str3 = "up";
                                    }
                                    strM8808y = m8808y(obj, str3);
                                    if (TextUtils.isEmpty(strM8808y)) {
                                    }
                                    n8c.a("PushLevelChange", "DYNAMIC_SCALING " + strM8808y);
                                    break;
                                default:
                                    strM8808y = "";
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            strM8818v = m8819w(obj);
            str = this.f2493P;
            String str11 = strM8818v;
            str2 = str;
            strM8808y = str11;
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(strM8808y)) {
            return;
        }
        k(str2, strM8808y);
    }

    /* JADX INFO: renamed from: l */
    public String m8811l(Object obj) {
        return m8821z(obj);
    }

    /* JADX INFO: renamed from: m */
    public String m8812m(Object obj, int i) {
        return m8809A(obj, i);
    }

    /* JADX INFO: renamed from: o */
    public String m8813o(Object obj) {
        return super.o(obj);
    }

    /* JADX INFO: renamed from: q */
    public int m8814q() {
        return ((bw00) this).k;
    }

    /* JADX INFO: renamed from: r */
    public String m8816r(Object obj) {
        if (m8814q() != 0 || !e(obj) || !((bw00) this).l.equals(obj.toString())) {
            return "";
        }
        return "{" + System.currentTimeMillis() + "}";
    }

    /* JADX INFO: renamed from: s */
    public String m8817s(Object obj) {
        if (m8814q() != 0 || !e(obj) || !((bw00) this).l.equals(obj.toString())) {
            return "";
        }
        return "{" + System.currentTimeMillis() + "}";
    }

    /* JADX INFO: renamed from: v */
    public String m8818v(Object obj) {
        if (!e(obj) || !((bw00) this).l.equals(obj.toString())) {
            return "";
        }
        this.f2503Z = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.f2503Z);
        sb.append(",");
        sb.append(e(((bw00) this).r) ? ((bw00) this).r.X0() : 0L);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: w */
    public String m8819w(Object obj) {
        if (!e(obj) || !((bw00) this).l.equals(obj.toString())) {
            return "";
        }
        StringBuilder sb = new StringBuilder("{");
        sb.append(System.currentTimeMillis());
        sb.append(",");
        sb.append(System.currentTimeMillis() - this.f2503Z);
        sb.append(",");
        sb.append(e(((bw00) this).r) ? ((bw00) this).r.X0() : 0L);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: z */
    public String m8821z(Object obj) {
        return super.l(obj);
    }

    /* JADX INFO: renamed from: q0 */
    public void m8815q0(int i, int i2, Object obj) {
    }

    /* JADX INFO: renamed from: w0 */
    public void m8820w0(int i, int i2, Object obj) {
    }
}

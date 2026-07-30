package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.CommandMessage;
import com.heytap.mcssdk.mode.Message;

/* JADX INFO: loaded from: classes8.dex */
public class cw00 extends aw00 implements dxl {

    /* JADX INFO: renamed from: K */
    protected String f82724K;

    /* JADX INFO: renamed from: L */
    protected String f82725L;

    /* JADX INFO: renamed from: M */
    protected String f82726M;

    /* JADX INFO: renamed from: N */
    protected String f82727N;

    /* JADX INFO: renamed from: O */
    protected String f82728O;

    /* JADX INFO: renamed from: P */
    protected String f82729P;

    /* JADX INFO: renamed from: Q */
    protected String f82730Q;

    /* JADX INFO: renamed from: R */
    private String f82731R;

    /* JADX INFO: renamed from: S */
    private String f82732S;

    /* JADX INFO: renamed from: T */
    private String f82733T;

    /* JADX INFO: renamed from: U */
    private String f82734U;

    /* JADX INFO: renamed from: V */
    private String f82735V;

    /* JADX INFO: renamed from: W */
    private String f82736W;

    /* JADX INFO: renamed from: X */
    private String f82737X;

    /* JADX INFO: renamed from: Y */
    private String f82738Y;

    /* JADX INFO: renamed from: Z */
    long f82739Z;

    public cw00(String str) {
        super(str);
        this.f82724K = "v2.bitRateAdaptStart";
        this.f82725L = "v2.bitRateAdaptStop";
        this.f82726M = "v2.conferenceStart";
        this.f82727N = "v2.conferenceStop";
        this.f82728O = "v2.pushBufferStart";
        this.f82729P = "v2.pushBufferStop";
        this.f82730Q = "v2.pushFilter";
        this.f82731R = "v2.pushLevelChange";
        this.f82732S = "v2.pushDropStart";
        this.f82733T = "v2.pushDropStop";
        this.f82734U = "v2.quicAgentStart";
        this.f82735V = "v2.quicAgentConnected";
        this.f82736W = "v2.quicAgentWatch";
        this.f82737X = "v2.quicAgentStop";
        this.f82738Y = "v2.quicAgentClosed";
        this.f77554a = "v2.pushWatch";
        this.f77556c = "v2.pushStart";
        this.f77557d = "v2.pushStop";
        this.f77558e = "v2.pushBitrateChange";
    }

    /* JADX INFO: renamed from: u */
    private String m108978u(Object obj, int i) {
        n8c.m158483a("zhengjijian", "logLinkedRenderAndStop [" + obj.toString() + "] " + i + "/" + this.f77565l);
        if (!m104119e(obj) || !this.f77565l.equals(obj.toString())) {
            return "";
        }
        String strMo20010g1 = ((ewl) obj).mo20010g1(Message.MESSAGE_CMD_DATA, i, null);
        return "{" + System.currentTimeMillis() + Constants.SEPARATOR_COMMA + strMo20010g1 + "}";
    }

    /* JADX INFO: renamed from: x */
    private String m108979x(Object obj, boolean z) {
        if (m108982q() != 0 || !m104119e(obj) || !this.f77565l.equals(obj.toString()) || !(obj instanceof kw00)) {
            return "";
        }
        kw00 kw00Var = (kw00) obj;
        int iMo19937J0 = (int) kw00Var.mo19937J0();
        int iMo19988X0 = (int) kw00Var.mo19988X0();
        int iMo20048u1 = (int) kw00Var.mo20048u1();
        int iMo19919D0 = (int) kw00Var.mo19919D0();
        int iM147496b4 = kw00Var.m147496b4();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!z) {
            return "{" + jCurrentTimeMillis + Constants.SEPARATOR_COMMA + iMo19937J0 + Constants.SEPARATOR_COMMA + iMo19988X0 + Constants.SEPARATOR_COMMA + iMo20048u1 + Constants.SEPARATOR_COMMA + iMo19919D0 + "}";
        }
        return "{" + jCurrentTimeMillis + Constants.SEPARATOR_COMMA + iMo19937J0 + Constants.SEPARATOR_COMMA + iMo19988X0 + Constants.SEPARATOR_COMMA + iMo20048u1 + Constants.SEPARATOR_COMMA + iMo19919D0 + Constants.SEPARATOR_COMMA + iM147496b4 + "}";
    }

    /* JADX INFO: renamed from: y */
    private String m108980y(Object obj, String str) {
        if (!m104119e(obj) || !this.f77565l.equals(obj.toString())) {
            return "";
        }
        ewl ewlVar = (ewl) obj;
        int iMo19937J0 = (int) ewlVar.mo19937J0();
        int iMo19988X0 = (int) ewlVar.mo19988X0();
        int iMo20048u1 = (int) ewlVar.mo20048u1();
        int iMo19919D0 = (int) ewlVar.mo19919D0();
        String strMo20010g1 = ewlVar.mo20010g1(4103, 0, null);
        return "{" + System.currentTimeMillis() + Constants.SEPARATOR_COMMA + iMo19937J0 + Constants.SEPARATOR_COMMA + iMo19988X0 + Constants.SEPARATOR_COMMA + iMo20048u1 + Constants.SEPARATOR_COMMA + iMo19919D0 + Constants.SEPARATOR_COMMA + str + Constants.SEPARATOR_COMMA + strMo20010g1 + "}";
    }

    /* JADX INFO: renamed from: A */
    public String m108981A(Object obj, int i) {
        return super.mo99221m(obj, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    @Override // p149l.aw00, p149l.bw00, p149l.hu00.InterfaceC17394c
    /* JADX INFO: renamed from: a */
    public void mo99216a(int i, int i2, Object obj) {
        String strM108985v;
        String str;
        String str2;
        String strM108980y;
        String str3;
        super.mo99216a(i, i2, obj);
        if (i == 4099) {
            strM108985v = m108985v(obj);
            str = this.f82728O;
            String str4 = strM108985v;
            str2 = str;
            strM108980y = str4;
        } else if (i == 4100) {
            strM108985v = m108986w(obj);
            str = this.f82729P;
            String str5 = strM108985v;
            str2 = str;
            strM108980y = str5;
        } else if (i == 8194) {
            strM108985v = m108985v(obj);
            str = this.f82728O;
            String str6 = strM108985v;
            str2 = str;
            strM108980y = str6;
        } else if (i != 8195) {
            str2 = "";
            switch (i) {
                case 8197:
                    if (i2 == 1) {
                        str3 = "down";
                    } else {
                        str3 = "up";
                    }
                    strM108980y = m108980y(obj, str3);
                    str2 = TextUtils.isEmpty(strM108980y) ? "" : this.f82731R;
                    n8c.m158483a("PushLevelChange", "DYNAMIC_SCALING " + strM108980y);
                    break;
                case 8198:
                    strM108980y = m108978u(obj, i2);
                    str2 = TextUtils.isEmpty(strM108980y) ? "" : "v2.confRenderStart";
                    n8c.m158483a("zhengjijian", "linked_render confRenderStart " + i2 + "/" + strM108980y);
                    break;
                case 8199:
                    strM108980y = m108978u(obj, i2);
                    str2 = TextUtils.isEmpty(strM108980y) ? "" : "v2.confRenderStop";
                    n8c.m158483a("zhengjijian", "linked_render confRenderStop " + i2 + "/" + strM108980y);
                    break;
                default:
                    switch (i) {
                        case CommandMessage.COMMAND_GET_ALIAS /* 12293 */:
                            strM108985v = m108983r(obj);
                            str = this.f82724K;
                            String str7 = strM108985v;
                            str2 = str;
                            strM108980y = str7;
                            break;
                        case CommandMessage.COMMAND_UNSET_ALIAS /* 12294 */:
                            strM108985v = m108984s(obj);
                            str = this.f82725L;
                            String str8 = strM108985v;
                            str2 = str;
                            strM108980y = str8;
                            break;
                        case CommandMessage.COMMAND_SET_TAGS /* 12295 */:
                            strM108985v = m108985v(obj);
                            str = this.f82728O;
                            String str9 = strM108985v;
                            str2 = str;
                            strM108980y = str9;
                            break;
                        case CommandMessage.COMMAND_GET_TAGS /* 12296 */:
                            strM108985v = m108986w(obj);
                            str = this.f82729P;
                            String str10 = strM108985v;
                            str2 = str;
                            strM108980y = str10;
                            break;
                        default:
                            switch (i) {
                                case CommandMessage.COMMAND_RESUME_PUSH /* 12300 */:
                                    strM108980y = m108979x(obj, false);
                                    if (!TextUtils.isEmpty(strM108980y)) {
                                        str2 = this.f82732S;
                                    }
                                    break;
                                case CommandMessage.COMMAND_SET_ACCOUNTS /* 12301 */:
                                    strM108980y = m108979x(obj, true);
                                    if (!TextUtils.isEmpty(strM108980y)) {
                                        str2 = this.f82733T;
                                    }
                                    break;
                                case CommandMessage.COMMAND_GET_ACCOUNTS /* 12302 */:
                                    if (i2 == 1) {
                                        str3 = "down";
                                    } else {
                                        str3 = "up";
                                    }
                                    strM108980y = m108980y(obj, str3);
                                    if (TextUtils.isEmpty(strM108980y)) {
                                    }
                                    n8c.m158483a("PushLevelChange", "DYNAMIC_SCALING " + strM108980y);
                                    break;
                                default:
                                    strM108980y = "";
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            strM108985v = m108986w(obj);
            str = this.f82729P;
            String str11 = strM108985v;
            str2 = str;
            strM108980y = str11;
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(strM108980y)) {
            return;
        }
        m104121k(str2, strM108980y);
    }

    @Override // p149l.aw00, p149l.bw00
    /* JADX INFO: renamed from: l */
    public String mo99220l(Object obj) {
        return m108987z(obj);
    }

    @Override // p149l.aw00, p149l.bw00
    /* JADX INFO: renamed from: m */
    public String mo99221m(Object obj, int i) {
        return m108981A(obj, i);
    }

    @Override // p149l.aw00, p149l.bw00
    /* JADX INFO: renamed from: o */
    public String mo99222o(Object obj) {
        return super.mo99222o(obj);
    }

    /* JADX INFO: renamed from: q */
    public int m108982q() {
        return this.f77564k;
    }

    /* JADX INFO: renamed from: r */
    public String m108983r(Object obj) {
        if (m108982q() != 0 || !m104119e(obj) || !this.f77565l.equals(obj.toString())) {
            return "";
        }
        return "{" + System.currentTimeMillis() + "}";
    }

    /* JADX INFO: renamed from: s */
    public String m108984s(Object obj) {
        if (m108982q() != 0 || !m104119e(obj) || !this.f77565l.equals(obj.toString())) {
            return "";
        }
        return "{" + System.currentTimeMillis() + "}";
    }

    /* JADX INFO: renamed from: v */
    public String m108985v(Object obj) {
        if (!m104119e(obj) || !this.f77565l.equals(obj.toString())) {
            return "";
        }
        this.f82739Z = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.f82739Z);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(m104119e(this.f77571r) ? this.f77571r.mo19988X0() : 0L);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: w */
    public String m108986w(Object obj) {
        if (!m104119e(obj) || !this.f77565l.equals(obj.toString())) {
            return "";
        }
        StringBuilder sb = new StringBuilder("{");
        sb.append(System.currentTimeMillis());
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(System.currentTimeMillis() - this.f82739Z);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(m104119e(this.f77571r) ? this.f77571r.mo19988X0() : 0L);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: z */
    public String m108987z(Object obj) {
        return super.mo99220l(obj);
    }

    @Override // p149l.hu00.InterfaceC17393b
    /* JADX INFO: renamed from: q0 */
    public void mo19749q0(int i, int i2, Object obj) {
    }

    @Override // p149l.hu00.InterfaceC17393b
    /* JADX INFO: renamed from: w0 */
    public void mo19750w0(int i, int i2, Object obj) {
    }
}

package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.CommandMessage;
import com.heytap.mcssdk.mode.Message;

/* JADX INFO: loaded from: classes8.dex */
public class k410 extends i410 implements wzl {

    /* JADX INFO: renamed from: K */
    protected String f123809K;

    /* JADX INFO: renamed from: L */
    protected String f123810L;

    /* JADX INFO: renamed from: M */
    protected String f123811M;

    /* JADX INFO: renamed from: N */
    protected String f123812N;

    /* JADX INFO: renamed from: O */
    protected String f123813O;

    /* JADX INFO: renamed from: P */
    protected String f123814P;

    /* JADX INFO: renamed from: Q */
    protected String f123815Q;

    /* JADX INFO: renamed from: R */
    private String f123816R;

    /* JADX INFO: renamed from: S */
    private String f123817S;

    /* JADX INFO: renamed from: T */
    private String f123818T;

    /* JADX INFO: renamed from: U */
    private String f123819U;

    /* JADX INFO: renamed from: V */
    private String f123820V;

    /* JADX INFO: renamed from: W */
    private String f123821W;

    /* JADX INFO: renamed from: X */
    private String f123822X;

    /* JADX INFO: renamed from: Y */
    private String f123823Y;

    /* JADX INFO: renamed from: Z */
    long f123824Z;

    public k410(String str) {
        super(str);
        this.f123809K = "v2.bitRateAdaptStart";
        this.f123810L = "v2.bitRateAdaptStop";
        this.f123811M = "v2.conferenceStart";
        this.f123812N = "v2.conferenceStop";
        this.f123813O = "v2.pushBufferStart";
        this.f123814P = "v2.pushBufferStop";
        this.f123815Q = "v2.pushFilter";
        this.f123816R = "v2.pushLevelChange";
        this.f123817S = "v2.pushDropStart";
        this.f123818T = "v2.pushDropStop";
        this.f123819U = "v2.quicAgentStart";
        this.f123820V = "v2.quicAgentConnected";
        this.f123821W = "v2.quicAgentWatch";
        this.f123822X = "v2.quicAgentStop";
        this.f123823Y = "v2.quicAgentClosed";
        this.f118235a = "v2.pushWatch";
        this.f118237c = "v2.pushStart";
        this.f118238d = "v2.pushStop";
        this.f118239e = "v2.pushBitrateChange";
    }

    /* JADX INFO: renamed from: u */
    private String m148208u(Object obj, int i) {
        t9c.m189743a("zhengjijian", "logLinkedRenderAndStop [" + obj.toString() + "] " + i + "/" + this.f118246l);
        if (!m143393e(obj) || !this.f118246l.equals(obj.toString())) {
            return "";
        }
        String strMo21009g1 = ((wyl) obj).mo21009g1(Message.MESSAGE_CMD_DATA, i, null);
        return "{" + System.currentTimeMillis() + Constants.SEPARATOR_COMMA + strMo21009g1 + "}";
    }

    /* JADX INFO: renamed from: x */
    private String m148209x(Object obj, boolean z) {
        if (m148212q() != 0 || !m143393e(obj) || !this.f118246l.equals(obj.toString()) || !(obj instanceof s410)) {
            return "";
        }
        s410 s410Var = (s410) obj;
        int iMo20936J0 = (int) s410Var.mo20936J0();
        int iMo20987X0 = (int) s410Var.mo20987X0();
        int iMo21047u1 = (int) s410Var.mo21047u1();
        int iMo20918D0 = (int) s410Var.mo20918D0();
        int iM184414b4 = s410Var.m184414b4();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!z) {
            return "{" + jCurrentTimeMillis + Constants.SEPARATOR_COMMA + iMo20936J0 + Constants.SEPARATOR_COMMA + iMo20987X0 + Constants.SEPARATOR_COMMA + iMo21047u1 + Constants.SEPARATOR_COMMA + iMo20918D0 + "}";
        }
        return "{" + jCurrentTimeMillis + Constants.SEPARATOR_COMMA + iMo20936J0 + Constants.SEPARATOR_COMMA + iMo20987X0 + Constants.SEPARATOR_COMMA + iMo21047u1 + Constants.SEPARATOR_COMMA + iMo20918D0 + Constants.SEPARATOR_COMMA + iM184414b4 + "}";
    }

    /* JADX INFO: renamed from: y */
    private String m148210y(Object obj, String str) {
        if (!m143393e(obj) || !this.f118246l.equals(obj.toString())) {
            return "";
        }
        wyl wylVar = (wyl) obj;
        int iMo20936J0 = (int) wylVar.mo20936J0();
        int iMo20987X0 = (int) wylVar.mo20987X0();
        int iMo21047u1 = (int) wylVar.mo21047u1();
        int iMo20918D0 = (int) wylVar.mo20918D0();
        String strMo21009g1 = wylVar.mo21009g1(4103, 0, null);
        return "{" + System.currentTimeMillis() + Constants.SEPARATOR_COMMA + iMo20936J0 + Constants.SEPARATOR_COMMA + iMo20987X0 + Constants.SEPARATOR_COMMA + iMo21047u1 + Constants.SEPARATOR_COMMA + iMo20918D0 + Constants.SEPARATOR_COMMA + str + Constants.SEPARATOR_COMMA + strMo21009g1 + "}";
    }

    /* JADX INFO: renamed from: A */
    public String m148211A(Object obj, int i) {
        return super.mo138384m(obj, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    @Override // p153l.i410, p153l.j410, p153l.q210.InterfaceC19502c
    /* JADX INFO: renamed from: a */
    public void mo133538a(int i, int i2, Object obj) {
        String strM148215v;
        String str;
        String str2;
        String strM148210y;
        String str3;
        super.mo133538a(i, i2, obj);
        if (i == 4099) {
            strM148215v = m148215v(obj);
            str = this.f123813O;
            String str4 = strM148215v;
            str2 = str;
            strM148210y = str4;
        } else if (i == 4100) {
            strM148215v = m148216w(obj);
            str = this.f123814P;
            String str5 = strM148215v;
            str2 = str;
            strM148210y = str5;
        } else if (i == 8194) {
            strM148215v = m148215v(obj);
            str = this.f123813O;
            String str6 = strM148215v;
            str2 = str;
            strM148210y = str6;
        } else if (i != 8195) {
            str2 = "";
            switch (i) {
                case 8197:
                    if (i2 == 1) {
                        str3 = "down";
                    } else {
                        str3 = "up";
                    }
                    strM148210y = m148210y(obj, str3);
                    str2 = TextUtils.isEmpty(strM148210y) ? "" : this.f123816R;
                    t9c.m189743a("PushLevelChange", "DYNAMIC_SCALING " + strM148210y);
                    break;
                case 8198:
                    strM148210y = m148208u(obj, i2);
                    str2 = TextUtils.isEmpty(strM148210y) ? "" : "v2.confRenderStart";
                    t9c.m189743a("zhengjijian", "linked_render confRenderStart " + i2 + "/" + strM148210y);
                    break;
                case 8199:
                    strM148210y = m148208u(obj, i2);
                    str2 = TextUtils.isEmpty(strM148210y) ? "" : "v2.confRenderStop";
                    t9c.m189743a("zhengjijian", "linked_render confRenderStop " + i2 + "/" + strM148210y);
                    break;
                default:
                    switch (i) {
                        case CommandMessage.COMMAND_GET_ALIAS /* 12293 */:
                            strM148215v = m148213r(obj);
                            str = this.f123809K;
                            String str7 = strM148215v;
                            str2 = str;
                            strM148210y = str7;
                            break;
                        case CommandMessage.COMMAND_UNSET_ALIAS /* 12294 */:
                            strM148215v = m148214s(obj);
                            str = this.f123810L;
                            String str8 = strM148215v;
                            str2 = str;
                            strM148210y = str8;
                            break;
                        case CommandMessage.COMMAND_SET_TAGS /* 12295 */:
                            strM148215v = m148215v(obj);
                            str = this.f123813O;
                            String str9 = strM148215v;
                            str2 = str;
                            strM148210y = str9;
                            break;
                        case CommandMessage.COMMAND_GET_TAGS /* 12296 */:
                            strM148215v = m148216w(obj);
                            str = this.f123814P;
                            String str10 = strM148215v;
                            str2 = str;
                            strM148210y = str10;
                            break;
                        default:
                            switch (i) {
                                case CommandMessage.COMMAND_RESUME_PUSH /* 12300 */:
                                    strM148210y = m148209x(obj, false);
                                    if (!TextUtils.isEmpty(strM148210y)) {
                                        str2 = this.f123817S;
                                    }
                                    break;
                                case CommandMessage.COMMAND_SET_ACCOUNTS /* 12301 */:
                                    strM148210y = m148209x(obj, true);
                                    if (!TextUtils.isEmpty(strM148210y)) {
                                        str2 = this.f123818T;
                                    }
                                    break;
                                case CommandMessage.COMMAND_GET_ACCOUNTS /* 12302 */:
                                    if (i2 == 1) {
                                        str3 = "down";
                                    } else {
                                        str3 = "up";
                                    }
                                    strM148210y = m148210y(obj, str3);
                                    if (TextUtils.isEmpty(strM148210y)) {
                                    }
                                    t9c.m189743a("PushLevelChange", "DYNAMIC_SCALING " + strM148210y);
                                    break;
                                default:
                                    strM148210y = "";
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            strM148215v = m148216w(obj);
            str = this.f123814P;
            String str11 = strM148215v;
            str2 = str;
            strM148210y = str11;
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(strM148210y)) {
            return;
        }
        m143395k(str2, strM148210y);
    }

    @Override // p153l.i410, p153l.j410
    /* JADX INFO: renamed from: l */
    public String mo138383l(Object obj) {
        return m148217z(obj);
    }

    @Override // p153l.i410, p153l.j410
    /* JADX INFO: renamed from: m */
    public String mo138384m(Object obj, int i) {
        return m148211A(obj, i);
    }

    @Override // p153l.i410, p153l.j410
    /* JADX INFO: renamed from: o */
    public String mo138385o(Object obj) {
        return super.mo138385o(obj);
    }

    /* JADX INFO: renamed from: q */
    public int m148212q() {
        return this.f118245k;
    }

    /* JADX INFO: renamed from: r */
    public String m148213r(Object obj) {
        if (m148212q() != 0 || !m143393e(obj) || !this.f118246l.equals(obj.toString())) {
            return "";
        }
        return "{" + System.currentTimeMillis() + "}";
    }

    /* JADX INFO: renamed from: s */
    public String m148214s(Object obj) {
        if (m148212q() != 0 || !m143393e(obj) || !this.f118246l.equals(obj.toString())) {
            return "";
        }
        return "{" + System.currentTimeMillis() + "}";
    }

    /* JADX INFO: renamed from: v */
    public String m148215v(Object obj) {
        if (!m143393e(obj) || !this.f118246l.equals(obj.toString())) {
            return "";
        }
        this.f123824Z = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.f123824Z);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(m143393e(this.f118252r) ? this.f118252r.mo20987X0() : 0L);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: w */
    public String m148216w(Object obj) {
        if (!m143393e(obj) || !this.f118246l.equals(obj.toString())) {
            return "";
        }
        StringBuilder sb = new StringBuilder("{");
        sb.append(System.currentTimeMillis());
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(System.currentTimeMillis() - this.f123824Z);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(m143393e(this.f118252r) ? this.f118252r.mo20987X0() : 0L);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: z */
    public String m148217z(Object obj) {
        return super.mo138383l(obj);
    }

    @Override // p153l.q210.InterfaceC19501b
    /* JADX INFO: renamed from: q0 */
    public void mo20748q0(int i, int i2, Object obj) {
    }

    @Override // p153l.q210.InterfaceC19501b
    /* JADX INFO: renamed from: w0 */
    public void mo20749w0(int i, int i2, Object obj) {
    }
}

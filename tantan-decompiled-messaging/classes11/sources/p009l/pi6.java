package p009l;

import android.graphics.Color;
import com.p000p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import l.c4g0;
import l.d30;
import l.dml;
import l.qsz;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pi6 {

    /* JADX INFO: renamed from: Q */
    public static final int f18601Q = t100.G;

    /* JADX INFO: renamed from: R */
    public static final int f18602R = t100.K;

    /* JADX INFO: renamed from: S */
    public static final int f18603S = Color.parseColor("#66000000");

    /* JADX INFO: renamed from: T */
    public static final int f18604T = Color.parseColor("#4d4d4d");

    /* JADX INFO: renamed from: U */
    public static final Message f18605U = Message.new_();

    /* JADX INFO: renamed from: A */
    public int f18606A;

    /* JADX INFO: renamed from: B */
    public ChatGroup f18607B;

    /* JADX INFO: renamed from: C */
    public c4g0[] f18608C;

    /* JADX INFO: renamed from: D */
    public ConversationItemView f18609D;

    /* JADX INFO: renamed from: E */
    public List<cpl> f18610E;

    /* JADX INFO: renamed from: F */
    public AtomicInteger f18611F;

    /* JADX INFO: renamed from: G */
    public double f18612G;

    /* JADX INFO: renamed from: H */
    public int f18613H;

    /* JADX INFO: renamed from: I */
    public Message f18614I;

    /* JADX INFO: renamed from: J */
    public d30 f18615J;

    /* JADX INFO: renamed from: O */
    public Conversation f18620O;

    /* JADX INFO: renamed from: P */
    public List<Conversation> f18621P;

    /* JADX INFO: renamed from: a */
    public Conversation f18622a;

    /* JADX INFO: renamed from: b */
    public User f18623b;

    /* JADX INFO: renamed from: c */
    public User f18624c;

    /* JADX INFO: renamed from: d */
    public dml f18625d;

    /* JADX INFO: renamed from: e */
    public boolean f18626e;

    /* JADX INFO: renamed from: f */
    public boolean f18627f;

    /* JADX INFO: renamed from: g */
    public int f18628g;

    /* JADX INFO: renamed from: h */
    public int f18629h;

    /* JADX INFO: renamed from: m */
    public int f18634m;

    /* JADX INFO: renamed from: w */
    public User f18644w;

    /* JADX INFO: renamed from: x */
    public Act f18645x;

    /* JADX INFO: renamed from: y */
    public String f18646y;

    /* JADX INFO: renamed from: z */
    public Message f18647z;

    /* JADX INFO: renamed from: i */
    public String f18630i = "";

    /* JADX INFO: renamed from: j */
    public String f18631j = "default";

    /* JADX INFO: renamed from: k */
    public qsz f18632k = new qsz();

    /* JADX INFO: renamed from: l */
    public String f18633l = "";

    /* JADX INFO: renamed from: n */
    public boolean f18635n = false;

    /* JADX INFO: renamed from: o */
    public boolean f18636o = false;

    /* JADX INFO: renamed from: p */
    public String f18637p = "";

    /* JADX INFO: renamed from: q */
    public String f18638q = "";

    /* JADX INFO: renamed from: r */
    public String f18639r = "";

    /* JADX INFO: renamed from: s */
    public double f18640s = 0.0d;

    /* JADX INFO: renamed from: t */
    public String f18641t = "";

    /* JADX INFO: renamed from: u */
    public boolean f18642u = false;

    /* JADX INFO: renamed from: v */
    public boolean f18643v = false;

    /* JADX INFO: renamed from: K */
    public String f18616K = "";

    /* JADX INFO: renamed from: L */
    public String f18617L = "";

    /* JADX INFO: renamed from: M */
    public String f18618M = "";

    /* JADX INFO: renamed from: N */
    public int f18619N = 0;

    public pi6(ConversationItemView conversationItemView, dml dmlVar, Conversation conversation) {
        this.f18625d = dmlVar;
        this.f18609D = conversationItemView;
        this.f18622a = conversation;
        this.f18610E = conversationItemView.f3703l;
        this.f18645x = conversationItemView.getContext();
    }

    /* JADX INFO: renamed from: a */
    public Message m20297a() {
        if (f18605U.equals(this.f18647z)) {
            return null;
        }
        return this.f18647z;
    }

    /* JADX INFO: renamed from: b */
    public void m20298b(Message message) {
        this.f18647z = message;
    }
}

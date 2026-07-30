package p149l;

import android.graphics.Color;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class pi6 {

    /* JADX INFO: renamed from: Q */
    public static final int f149080Q = t100.f167232G;

    /* JADX INFO: renamed from: R */
    public static final int f149081R = t100.f167236K;

    /* JADX INFO: renamed from: S */
    public static final int f149082S = Color.parseColor("#66000000");

    /* JADX INFO: renamed from: T */
    public static final int f149083T = Color.parseColor("#4d4d4d");

    /* JADX INFO: renamed from: U */
    public static final Message f149084U = Message.new_();

    /* JADX INFO: renamed from: A */
    public int f149085A;

    /* JADX INFO: renamed from: B */
    public ChatGroup f149086B;

    /* JADX INFO: renamed from: C */
    public c4g0[] f149087C;

    /* JADX INFO: renamed from: D */
    public ConversationItemView f149088D;

    /* JADX INFO: renamed from: E */
    public List<cpl> f149089E;

    /* JADX INFO: renamed from: F */
    public AtomicInteger f149090F;

    /* JADX INFO: renamed from: G */
    public double f149091G;

    /* JADX INFO: renamed from: H */
    public int f149092H;

    /* JADX INFO: renamed from: I */
    public Message f149093I;

    /* JADX INFO: renamed from: J */
    public d30 f149094J;

    /* JADX INFO: renamed from: O */
    public Conversation f149099O;

    /* JADX INFO: renamed from: P */
    public List<Conversation> f149100P;

    /* JADX INFO: renamed from: a */
    public Conversation f149101a;

    /* JADX INFO: renamed from: b */
    public User f149102b;

    /* JADX INFO: renamed from: c */
    public User f149103c;

    /* JADX INFO: renamed from: d */
    public dml f149104d;

    /* JADX INFO: renamed from: e */
    public boolean f149105e;

    /* JADX INFO: renamed from: f */
    public boolean f149106f;

    /* JADX INFO: renamed from: g */
    public int f149107g;

    /* JADX INFO: renamed from: h */
    public int f149108h;

    /* JADX INFO: renamed from: m */
    public int f149113m;

    /* JADX INFO: renamed from: w */
    public User f149123w;

    /* JADX INFO: renamed from: x */
    public Act f149124x;

    /* JADX INFO: renamed from: y */
    public String f149125y;

    /* JADX INFO: renamed from: z */
    public Message f149126z;

    /* JADX INFO: renamed from: i */
    public String f149109i = "";

    /* JADX INFO: renamed from: j */
    public String f149110j = "default";

    /* JADX INFO: renamed from: k */
    public qsz f149111k = new qsz();

    /* JADX INFO: renamed from: l */
    public String f149112l = "";

    /* JADX INFO: renamed from: n */
    public boolean f149114n = false;

    /* JADX INFO: renamed from: o */
    public boolean f149115o = false;

    /* JADX INFO: renamed from: p */
    public String f149116p = "";

    /* JADX INFO: renamed from: q */
    public String f149117q = "";

    /* JADX INFO: renamed from: r */
    public String f149118r = "";

    /* JADX INFO: renamed from: s */
    public double f149119s = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: t */
    public String f149120t = "";

    /* JADX INFO: renamed from: u */
    public boolean f149121u = false;

    /* JADX INFO: renamed from: v */
    public boolean f149122v = false;

    /* JADX INFO: renamed from: K */
    public String f149095K = "";

    /* JADX INFO: renamed from: L */
    public String f149096L = "";

    /* JADX INFO: renamed from: M */
    public String f149097M = "";

    /* JADX INFO: renamed from: N */
    public int f149098N = 0;

    public pi6(ConversationItemView conversationItemView, dml dmlVar, Conversation conversation) {
        this.f149104d = dmlVar;
        this.f149088D = conversationItemView;
        this.f149101a = conversation;
        this.f149089E = conversationItemView.f24925l;
        this.f149124x = (PutongAct) conversationItemView.getContext();
    }

    /* JADX INFO: renamed from: a */
    public Message m169158a() {
        if (f149084U.equals(this.f149126z)) {
            return null;
        }
        return this.f149126z;
    }

    /* JADX INFO: renamed from: b */
    public void m169159b(Message message) {
        this.f149126z = message;
    }
}

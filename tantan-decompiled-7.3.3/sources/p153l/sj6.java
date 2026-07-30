package p153l;

import android.graphics.Color;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class sj6 {

    /* JADX INFO: renamed from: Q */
    public static final int f168905Q = qa00.f156294G;

    /* JADX INFO: renamed from: R */
    public static final int f168906R = qa00.f156298K;

    /* JADX INFO: renamed from: S */
    public static final int f168907S = Color.parseColor("#66000000");

    /* JADX INFO: renamed from: T */
    public static final int f168908T = Color.parseColor("#4d4d4d");

    /* JADX INFO: renamed from: U */
    public static final Message f168909U = Message.new_();

    /* JADX INFO: renamed from: A */
    public int f168910A;

    /* JADX INFO: renamed from: B */
    public ChatGroup f168911B;

    /* JADX INFO: renamed from: C */
    public kcg0[] f168912C;

    /* JADX INFO: renamed from: D */
    public ConversationItemView f168913D;

    /* JADX INFO: renamed from: E */
    public List<orl> f168914E;

    /* JADX INFO: renamed from: F */
    public AtomicInteger f168915F;

    /* JADX INFO: renamed from: G */
    public double f168916G;

    /* JADX INFO: renamed from: H */
    public int f168917H;

    /* JADX INFO: renamed from: I */
    public Message f168918I;

    /* JADX INFO: renamed from: J */
    public x20 f168919J;

    /* JADX INFO: renamed from: O */
    public Conversation f168924O;

    /* JADX INFO: renamed from: P */
    public List<Conversation> f168925P;

    /* JADX INFO: renamed from: a */
    public Conversation f168926a;

    /* JADX INFO: renamed from: b */
    public User f168927b;

    /* JADX INFO: renamed from: c */
    public User f168928c;

    /* JADX INFO: renamed from: d */
    public pol f168929d;

    /* JADX INFO: renamed from: e */
    public boolean f168930e;

    /* JADX INFO: renamed from: f */
    public boolean f168931f;

    /* JADX INFO: renamed from: g */
    public int f168932g;

    /* JADX INFO: renamed from: h */
    public int f168933h;

    /* JADX INFO: renamed from: m */
    public int f168938m;

    /* JADX INFO: renamed from: w */
    public User f168948w;

    /* JADX INFO: renamed from: x */
    public Act f168949x;

    /* JADX INFO: renamed from: y */
    public String f168950y;

    /* JADX INFO: renamed from: z */
    public Message f168951z;

    /* JADX INFO: renamed from: i */
    public String f168934i = "";

    /* JADX INFO: renamed from: j */
    public String f168935j = "default";

    /* JADX INFO: renamed from: k */
    public n100 f168936k = new n100();

    /* JADX INFO: renamed from: l */
    public String f168937l = "";

    /* JADX INFO: renamed from: n */
    public boolean f168939n = false;

    /* JADX INFO: renamed from: o */
    public boolean f168940o = false;

    /* JADX INFO: renamed from: p */
    public String f168941p = "";

    /* JADX INFO: renamed from: q */
    public String f168942q = "";

    /* JADX INFO: renamed from: r */
    public String f168943r = "";

    /* JADX INFO: renamed from: s */
    public double f168944s = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: t */
    public String f168945t = "";

    /* JADX INFO: renamed from: u */
    public boolean f168946u = false;

    /* JADX INFO: renamed from: v */
    public boolean f168947v = false;

    /* JADX INFO: renamed from: K */
    public String f168920K = "";

    /* JADX INFO: renamed from: L */
    public String f168921L = "";

    /* JADX INFO: renamed from: M */
    public String f168922M = "";

    /* JADX INFO: renamed from: N */
    public int f168923N = 0;

    public sj6(ConversationItemView conversationItemView, pol polVar, Conversation conversation) {
        this.f168929d = polVar;
        this.f168913D = conversationItemView;
        this.f168926a = conversation;
        this.f168914E = conversationItemView.f25667l;
        this.f168949x = (PutongAct) conversationItemView.getContext();
    }

    /* JADX INFO: renamed from: a */
    public Message m186059a() {
        if (f168909U.equals(this.f168951z)) {
            return null;
        }
        return this.f168951z;
    }

    /* JADX INFO: renamed from: b */
    public void m186060b(Message message) {
        this.f168951z = message;
    }
}

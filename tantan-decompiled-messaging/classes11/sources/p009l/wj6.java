package p009l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l.e30;
import l.e51;
import l.j760;
import l.jq2;
import l.mcr;
import l.o6j0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wj6 extends jq2<dk6> {

    /* JADX INFO: renamed from: a */
    public boolean f22143a;

    /* JADX INFO: renamed from: b */
    public String f22144b;

    /* JADX INFO: renamed from: c */
    public j760<List<Conversation>, List<User>> f22145c;

    /* JADX INFO: renamed from: d */
    public j760<List<Conversation>, List<Message>> f22146d;

    /* JADX INFO: renamed from: e */
    public int f22147e;

    /* JADX INFO: renamed from: f */
    public String f22148f;

    /* JADX INFO: renamed from: g */
    public boolean f22149g;

    /* JADX INFO: renamed from: h */
    public long f22150h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f22151i;

    /* JADX INFO: renamed from: j */
    public List<Conversation> f22152j;

    /* JADX INFO: renamed from: k */
    public List<User> f22153k;

    /* JADX INFO: renamed from: l */
    public List<Conversation> f22154l;

    /* JADX INFO: renamed from: m */
    public List<Message> f22155m;

    public wj6(mcr mcrVar) {
        super(mcrVar);
        this.f22143a = false;
        this.f22144b = null;
        this.f22145c = j760.a(new ArrayList(), new ArrayList());
        this.f22146d = j760.a(new ArrayList(), new ArrayList());
        this.f22147e = ConversationSearchAct.f4729m;
        this.f22148f = "";
        this.f22149g = false;
        this.f22150h = -1L;
        this.f22151i = new AtomicBoolean(false);
        this.f22152j = new ArrayList();
        this.f22153k = new ArrayList();
        this.f22154l = new ArrayList();
        this.f22155m = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m24250j0(Bundle bundle) {
        if (NullChecker.a(((dk6) ((jq2) this).viewModel).f11874k.getIntent()) && ((dk6) ((jq2) this).viewModel).f11874k.getIntent().hasExtra(ConversationSearchAct.f4723g)) {
            this.f22147e = ((dk6) ((jq2) this).viewModel).f11874k.getIntent().getIntExtra(ConversationSearchAct.f4723g, ConversationSearchAct.f4729m);
        }
        if (NullChecker.a(((dk6) ((jq2) this).viewModel).f11874k.getIntent()) && ((dk6) ((jq2) this).viewModel).f11874k.getIntent().hasExtra(ConversationSearchAct.f4725i)) {
            this.f22148f = ((dk6) ((jq2) this).viewModel).f11874k.getIntent().getStringExtra(ConversationSearchAct.f4725i);
        }
        if (NullChecker.a(((dk6) ((jq2) this).viewModel).f11874k.getIntent()) && ((dk6) ((jq2) this).viewModel).f11874k.getIntent().hasExtra(ConversationSearchAct.f4726j)) {
            this.f22149g = ((dk6) ((jq2) this).viewModel).f11874k.getIntent().getBooleanExtra(ConversationSearchAct.f4726j, false);
        }
        ((dk6) ((jq2) this).viewModel).m13413r();
        ((dk6) ((jq2) this).viewModel).m13420z(true);
    }

    /* JADX INFO: renamed from: a0 */
    public void m24251a0() {
        super.a0();
        creates(new e30() { // from class: l.rj6
            public final void call(Object obj) {
                this.f19863a.m24250j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m24252k0(boolean z, String str) {
        boolean z2 = false;
        this.f22143a = false;
        j760<List<Conversation>, List<User>> j760Var = this.f22145c;
        List<Conversation> list = (List) j760Var.a;
        List<User> arrayList = z ? (List) j760Var.b : new ArrayList<>();
        j760<List<Conversation>, List<Message>> j760Var2 = this.f22146d;
        m24257p0(list, arrayList, (List) j760Var2.a, (List) j760Var2.b, str);
        dk6 dk6Var = (dk6) ((jq2) this).viewModel;
        if (vwb.J((Collection) this.f22145c.a) && ((!z || vwb.J((Collection) this.f22145c.b)) && vwb.J((Collection) this.f22146d.a))) {
            z2 = true;
        }
        dk6Var.m13418x(z2);
        String str2 = this.f22144b;
        if (str2 != null) {
            m24259r0(str2, this.f22148f);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m24253l0(String str) {
        this.f22143a = false;
        m24258q0();
        String str2 = this.f22144b;
        if (str2 != null) {
            m24259r0(str2, str);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m24254m0(String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            e51.G(new Runnable() { // from class: l.uj6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21210a.m24253l0(str2);
                }
            });
            return;
        }
        Object obj = this.f22145c.a;
        if (obj != null) {
            ((List) obj).clear();
        }
        Object obj2 = this.f22145c.b;
        if (obj2 != null) {
            ((List) obj2).clear();
        }
        Object obj3 = this.f22146d.a;
        if (obj3 != null) {
            ((List) obj3).clear();
        }
        Object obj4 = this.f22146d.b;
        if (obj4 != null) {
            ((List) obj4).clear();
        }
        j760<List<Conversation>, List<User>> j760VarAf = CoreModule.c.f0.af(str);
        this.f22145c = j760VarAf;
        if (!vwb.J((Collection) j760VarAf.a)) {
            o6j0.h("e_search_result", "p_chat_search", new o6j0.a[]{o6j0.a.h("keyword_research", str), o6j0.a.h("keyword_research_antispam_result", "pass")});
        }
        m24256o0(str, false);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m24255n0(String str) {
        ArrayList<String> stringArrayListExtra;
        ArrayList<String> stringArrayListExtra2 = null;
        if (NullChecker.a(((dk6) ((jq2) this).viewModel).f11874k.getIntent())) {
            stringArrayListExtra2 = ((dk6) ((jq2) this).viewModel).f11874k.getIntent().hasExtra(ConversationSearchAct.f4727k) ? ((dk6) ((jq2) this).viewModel).f11874k.getIntent().getStringArrayListExtra(ConversationSearchAct.f4727k) : null;
            stringArrayListExtra = ((dk6) ((jq2) this).viewModel).f11874k.getIntent().hasExtra(ConversationSearchAct.f4728l) ? ((dk6) ((jq2) this).viewModel).f11874k.getIntent().getStringArrayListExtra(ConversationSearchAct.f4728l) : null;
        } else {
            stringArrayListExtra = null;
        }
        if (vwb.J(stringArrayListExtra2)) {
            return;
        }
        if (this.f22147e == ConversationSearchAct.f4729m || (stringArrayListExtra != null && stringArrayListExtra.size() == stringArrayListExtra2.size())) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean z = this.f22147e != ConversationSearchAct.f4729m && NullChecker.a(stringArrayListExtra);
            for (int i = 0; i < stringArrayListExtra2.size(); i++) {
                Conversation conversationQuery = CoreModule.k.m.query(stringArrayListExtra2.get(i));
                if (z) {
                    Message messageQuery = CoreModule.k.c.query(stringArrayListExtra.get(i));
                    if (NullChecker.a(conversationQuery) && NullChecker.a(messageQuery)) {
                        arrayList.add(conversationQuery);
                        arrayList2.add(messageQuery);
                    }
                } else if (NullChecker.a(conversationQuery)) {
                    arrayList.add(conversationQuery);
                }
            }
            if (NullChecker.a(((dk6) ((jq2) this).viewModel).f11874k) && ((dk6) ((jq2) this).viewModel).f11874k.isFinishing()) {
                return;
            }
            int i2 = this.f22147e;
            if (i2 == ConversationSearchAct.f4729m) {
                m24257p0(arrayList, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), str);
            } else if (i2 == ConversationSearchAct.f4730n) {
                m24257p0(new ArrayList<>(), new ArrayList<>(), arrayList, arrayList2, str);
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m24256o0(final String str, final boolean z) {
        e51.F(act(), new Runnable() { // from class: l.vj6
            @Override // java.lang.Runnable
            public final void run() {
                this.f21601a.m24252k0(z, str);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m24257p0(List<Conversation> list, List<User> list2, List<Conversation> list3, List<Message> list4, String str) {
        this.f22152j = list;
        this.f22153k = list2;
        this.f22154l = list3;
        this.f22155m = list4;
        ((dk6) ((jq2) this).viewModel).m13416v(list, list2, list3, list4, str);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m24258q0() {
        m24257p0(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), "");
        ((dk6) ((jq2) this).viewModel).m13418x(true);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m24259r0(final String str, final String str2) {
        if (this.f22143a) {
            this.f22144b = str;
            return;
        }
        this.f22143a = true;
        this.f22144b = null;
        e51.y(new Runnable() { // from class: l.tj6
            @Override // java.lang.Runnable
            public final void run() {
                this.f20726a.m24254m0(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public void m24260s0(String str) {
        ((dk6) ((jq2) this).viewModel).m13417w(TextUtils.isEmpty(str.trim()));
        if (!TextUtils.isEmpty(str)) {
            m24259r0(str, "");
        } else if (this.f22143a) {
            this.f22144b = str;
        } else {
            m24258q0();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m24261t0(final String str) {
        e51.y(new Runnable() { // from class: l.sj6
            @Override // java.lang.Runnable
            public final void run() {
                this.f20309a.m24255n0(str);
            }
        });
    }

    public void destroy() {
    }
}

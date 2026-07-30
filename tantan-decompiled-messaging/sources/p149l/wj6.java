package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class wj6 extends jq2<dk6> {

    /* JADX INFO: renamed from: a */
    public boolean f186599a;

    /* JADX INFO: renamed from: b */
    public String f186600b;

    /* JADX INFO: renamed from: c */
    public j760<List<Conversation>, List<User>> f186601c;

    /* JADX INFO: renamed from: d */
    public j760<List<Conversation>, List<Message>> f186602d;

    /* JADX INFO: renamed from: e */
    public int f186603e;

    /* JADX INFO: renamed from: f */
    public String f186604f;

    /* JADX INFO: renamed from: g */
    public boolean f186605g;

    /* JADX INFO: renamed from: h */
    public long f186606h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f186607i;

    /* JADX INFO: renamed from: j */
    public List<Conversation> f186608j;

    /* JADX INFO: renamed from: k */
    public List<User> f186609k;

    /* JADX INFO: renamed from: l */
    public List<Conversation> f186610l;

    /* JADX INFO: renamed from: m */
    public List<Message> f186611m;

    public wj6(mcr mcrVar) {
        super(mcrVar);
        this.f186599a = false;
        this.f186600b = null;
        this.f186601c = j760.m140076a(new ArrayList(), new ArrayList());
        this.f186602d = j760.m140076a(new ArrayList(), new ArrayList());
        this.f186603e = ConversationSearchAct.f25951m;
        this.f186604f = "";
        this.f186605g = false;
        this.f186606h = -1L;
        this.f186607i = new AtomicBoolean(false);
        this.f186608j = new ArrayList();
        this.f186609k = new ArrayList();
        this.f186610l = new ArrayList();
        this.f186611m = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m203398j0(Bundle bundle) {
        if (NullChecker.m81303a(((dk6) this.viewModel).f86609k.getIntent()) && ((dk6) this.viewModel).f86609k.getIntent().hasExtra(ConversationSearchAct.f25945g)) {
            this.f186603e = ((dk6) this.viewModel).f86609k.getIntent().getIntExtra(ConversationSearchAct.f25945g, ConversationSearchAct.f25951m);
        }
        if (NullChecker.m81303a(((dk6) this.viewModel).f86609k.getIntent()) && ((dk6) this.viewModel).f86609k.getIntent().hasExtra(ConversationSearchAct.f25947i)) {
            this.f186604f = ((dk6) this.viewModel).f86609k.getIntent().getStringExtra(ConversationSearchAct.f25947i);
        }
        if (NullChecker.m81303a(((dk6) this.viewModel).f86609k.getIntent()) && ((dk6) this.viewModel).f86609k.getIntent().hasExtra(ConversationSearchAct.f25948j)) {
            this.f186605g = ((dk6) this.viewModel).f86609k.getIntent().getBooleanExtra(ConversationSearchAct.f25948j, false);
        }
        ((dk6) this.viewModel).m112177r();
        ((dk6) this.viewModel).m112184z(true);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.rj6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159653a.m203398j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m203399k0(boolean z, String str) {
        boolean z2 = false;
        this.f186599a = false;
        j760<List<Conversation>, List<User>> j760Var = this.f186601c;
        List<Conversation> list = j760Var.f116564a;
        List<User> arrayList = z ? j760Var.f116565b : new ArrayList<>();
        j760<List<Conversation>, List<Message>> j760Var2 = this.f186602d;
        m203404p0(list, arrayList, j760Var2.f116564a, j760Var2.f116565b, str);
        dk6 dk6Var = (dk6) this.viewModel;
        if (vwb.m200296J(this.f186601c.f116564a) && ((!z || vwb.m200296J(this.f186601c.f116565b)) && vwb.m200296J(this.f186602d.f116564a))) {
            z2 = true;
        }
        dk6Var.m112182x(z2);
        String str2 = this.f186600b;
        if (str2 != null) {
            m203406r0(str2, this.f186604f);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m203400l0(String str) {
        this.f186599a = false;
        m203405q0();
        String str2 = this.f186600b;
        if (str2 != null) {
            m203406r0(str2, str);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m203401m0(String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            e51.m114742G(new Runnable() { // from class: l.uj6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f176737a.m203400l0(str2);
                }
            });
            return;
        }
        List<Conversation> list = this.f186601c.f116564a;
        if (list != null) {
            list.clear();
        }
        List<User> list2 = this.f186601c.f116565b;
        if (list2 != null) {
            list2.clear();
        }
        List<Conversation> list3 = this.f186602d.f116564a;
        if (list3 != null) {
            list3.clear();
        }
        List<Message> list4 = this.f186602d.f116565b;
        if (list4 != null) {
            list4.clear();
        }
        j760<List<Conversation>, List<User>> j760VarM32892af = CoreModule.f17545c.f19642f0.m32892af(str);
        this.f186601c = j760VarM32892af;
        if (!vwb.m200296J(j760VarM32892af.f116564a)) {
            o6j0.m162864h("e_search_result", "p_chat_search", o6j0.C18854a.m162878h("keyword_research", str), o6j0.C18854a.m162878h("keyword_research_antispam_result", StateEvent.ActionValue.STAGE_PASS));
        }
        m203403o0(str, false);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m203402n0(String str) {
        ArrayList<String> stringArrayListExtra;
        ArrayList<String> stringArrayListExtra2 = null;
        if (NullChecker.m81303a(((dk6) this.viewModel).f86609k.getIntent())) {
            stringArrayListExtra2 = ((dk6) this.viewModel).f86609k.getIntent().hasExtra(ConversationSearchAct.f25949k) ? ((dk6) this.viewModel).f86609k.getIntent().getStringArrayListExtra(ConversationSearchAct.f25949k) : null;
            stringArrayListExtra = ((dk6) this.viewModel).f86609k.getIntent().hasExtra(ConversationSearchAct.f25950l) ? ((dk6) this.viewModel).f86609k.getIntent().getStringArrayListExtra(ConversationSearchAct.f25950l) : null;
        } else {
            stringArrayListExtra = null;
        }
        if (vwb.m200296J(stringArrayListExtra2)) {
            return;
        }
        if (this.f186603e == ConversationSearchAct.f25951m || (stringArrayListExtra != null && stringArrayListExtra.size() == stringArrayListExtra2.size())) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean z = this.f186603e != ConversationSearchAct.f25951m && NullChecker.m81303a(stringArrayListExtra);
            for (int i = 0; i < stringArrayListExtra2.size(); i++) {
                Conversation conversationQuery = CoreModule.f17553k.f91950m.query(stringArrayListExtra2.get(i));
                if (z) {
                    Message messageQuery = CoreModule.f17553k.f91940c.query(stringArrayListExtra.get(i));
                    if (NullChecker.m81303a(conversationQuery) && NullChecker.m81303a(messageQuery)) {
                        arrayList.add(conversationQuery);
                        arrayList2.add(messageQuery);
                    }
                } else if (NullChecker.m81303a(conversationQuery)) {
                    arrayList.add(conversationQuery);
                }
            }
            if (NullChecker.m81303a(((dk6) this.viewModel).f86609k) && ((dk6) this.viewModel).f86609k.isFinishing()) {
                return;
            }
            int i2 = this.f186603e;
            if (i2 == ConversationSearchAct.f25951m) {
                m203404p0(arrayList, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), str);
            } else if (i2 == ConversationSearchAct.f25952n) {
                m203404p0(new ArrayList<>(), new ArrayList<>(), arrayList, arrayList2, str);
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m203403o0(final String str, final boolean z) {
        e51.m114741F(act(), new Runnable() { // from class: l.vj6
            @Override // java.lang.Runnable
            public final void run() {
                this.f181664a.m203399k0(z, str);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m203404p0(List<Conversation> list, List<User> list2, List<Conversation> list3, List<Message> list4, String str) {
        this.f186608j = list;
        this.f186609k = list2;
        this.f186610l = list3;
        this.f186611m = list4;
        ((dk6) this.viewModel).m112180v(list, list2, list3, list4, str);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m203405q0() {
        m203404p0(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), "");
        ((dk6) this.viewModel).m112182x(true);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m203406r0(final String str, final String str2) {
        if (this.f186599a) {
            this.f186600b = str;
            return;
        }
        this.f186599a = true;
        this.f186600b = null;
        e51.m114774y(new Runnable() { // from class: l.tj6
            @Override // java.lang.Runnable
            public final void run() {
                this.f170653a.m203401m0(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public void m203407s0(String str) {
        ((dk6) this.viewModel).m112181w(TextUtils.isEmpty(str.trim()));
        if (!TextUtils.isEmpty(str)) {
            m203406r0(str, "");
        } else if (this.f186599a) {
            this.f186600b = str;
        } else {
            m203405q0();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m203408t0(final String str) {
        e51.m114774y(new Runnable() { // from class: l.sj6
            @Override // java.lang.Runnable
            public final void run() {
                this.f164807a.m203402n0(str);
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}

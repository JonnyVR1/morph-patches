package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class zk6 extends ar2<gl6> {

    /* JADX INFO: renamed from: a */
    public boolean f204732a;

    /* JADX INFO: renamed from: b */
    public String f204733b;

    /* JADX INFO: renamed from: c */
    public pf60<List<Conversation>, List<User>> f204734c;

    /* JADX INFO: renamed from: d */
    public pf60<List<Conversation>, List<Message>> f204735d;

    /* JADX INFO: renamed from: e */
    public int f204736e;

    /* JADX INFO: renamed from: f */
    public String f204737f;

    /* JADX INFO: renamed from: g */
    public boolean f204738g;

    /* JADX INFO: renamed from: h */
    public long f204739h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f204740i;

    /* JADX INFO: renamed from: j */
    public List<Conversation> f204741j;

    /* JADX INFO: renamed from: k */
    public List<User> f204742k;

    /* JADX INFO: renamed from: l */
    public List<Conversation> f204743l;

    /* JADX INFO: renamed from: m */
    public List<Message> f204744m;

    public zk6(ner nerVar) {
        super(nerVar);
        this.f204732a = false;
        this.f204733b = null;
        this.f204734c = pf60.m172085a(new ArrayList(), new ArrayList());
        this.f204735d = pf60.m172085a(new ArrayList(), new ArrayList());
        this.f204736e = ConversationSearchAct.f26693m;
        this.f204737f = "";
        this.f204738g = false;
        this.f204739h = -1L;
        this.f204740i = new AtomicBoolean(false);
        this.f204741j = new ArrayList();
        this.f204742k = new ArrayList();
        this.f204743l = new ArrayList();
        this.f204744m = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m220056j0(Bundle bundle) {
        if (NullChecker.m82486a(((gl6) this.viewModel).f104807k.getIntent()) && ((gl6) this.viewModel).f104807k.getIntent().hasExtra(ConversationSearchAct.f26687g)) {
            this.f204736e = ((gl6) this.viewModel).f104807k.getIntent().getIntExtra(ConversationSearchAct.f26687g, ConversationSearchAct.f26693m);
        }
        if (NullChecker.m82486a(((gl6) this.viewModel).f104807k.getIntent()) && ((gl6) this.viewModel).f104807k.getIntent().hasExtra(ConversationSearchAct.f26689i)) {
            this.f204737f = ((gl6) this.viewModel).f104807k.getIntent().getStringExtra(ConversationSearchAct.f26689i);
        }
        if (NullChecker.m82486a(((gl6) this.viewModel).f104807k.getIntent()) && ((gl6) this.viewModel).f104807k.getIntent().hasExtra(ConversationSearchAct.f26690j)) {
            this.f204738g = ((gl6) this.viewModel).f104807k.getIntent().getBooleanExtra(ConversationSearchAct.f26690j, false);
        }
        ((gl6) this.viewModel).m130632r();
        ((gl6) this.viewModel).m130639z(true);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.uk6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179367a.m220056j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m220057k0(boolean z, String str) {
        boolean z2 = false;
        this.f204732a = false;
        pf60<List<Conversation>, List<User>> pf60Var = this.f204734c;
        List<Conversation> list = pf60Var.f152156a;
        List<User> arrayList = z ? pf60Var.f152157b : new ArrayList<>();
        pf60<List<Conversation>, List<Message>> pf60Var2 = this.f204735d;
        m220062p0(list, arrayList, pf60Var2.f152156a, pf60Var2.f152157b, str);
        gl6 gl6Var = (gl6) this.viewModel;
        if (jyb.m147479J(this.f204734c.f152156a) && ((!z || jyb.m147479J(this.f204734c.f152157b)) && jyb.m147479J(this.f204735d.f152156a))) {
            z2 = true;
        }
        gl6Var.m130637x(z2);
        String str2 = this.f204733b;
        if (str2 != null) {
            m220064r0(str2, this.f204737f);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m220058l0(String str) {
        this.f204732a = false;
        m220063q0();
        String str2 = this.f204733b;
        if (str2 != null) {
            m220064r0(str2, str);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m220059m0(String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            l51.m152887G(new Runnable() { // from class: l.xk6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194712a.m220058l0(str2);
                }
            });
            return;
        }
        List<Conversation> list = this.f204734c.f152156a;
        if (list != null) {
            list.clear();
        }
        List<User> list2 = this.f204734c.f152157b;
        if (list2 != null) {
            list2.clear();
        }
        List<Conversation> list3 = this.f204735d.f152156a;
        if (list3 != null) {
            list3.clear();
        }
        List<Message> list4 = this.f204735d.f152157b;
        if (list4 != null) {
            list4.clear();
        }
        pf60<List<Conversation>, List<User>> pf60VarM33895af = CoreModule.f18264c.f20384f0.m33895af(str);
        this.f204734c = pf60VarM33895af;
        if (!jyb.m147479J(pf60VarM33895af.f152156a)) {
            sfj0.m185601h("e_search_result", "p_chat_search", sfj0.C20032a.m185615h("keyword_research", str), sfj0.C20032a.m185615h("keyword_research_antispam_result", StateEvent.ActionValue.STAGE_PASS));
        }
        m220061o0(str, false);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m220060n0(String str) {
        ArrayList<String> stringArrayListExtra;
        ArrayList<String> stringArrayListExtra2 = null;
        if (NullChecker.m82486a(((gl6) this.viewModel).f104807k.getIntent())) {
            stringArrayListExtra2 = ((gl6) this.viewModel).f104807k.getIntent().hasExtra(ConversationSearchAct.f26691k) ? ((gl6) this.viewModel).f104807k.getIntent().getStringArrayListExtra(ConversationSearchAct.f26691k) : null;
            stringArrayListExtra = ((gl6) this.viewModel).f104807k.getIntent().hasExtra(ConversationSearchAct.f26692l) ? ((gl6) this.viewModel).f104807k.getIntent().getStringArrayListExtra(ConversationSearchAct.f26692l) : null;
        } else {
            stringArrayListExtra = null;
        }
        if (jyb.m147479J(stringArrayListExtra2)) {
            return;
        }
        if (this.f204736e == ConversationSearchAct.f26693m || (stringArrayListExtra != null && stringArrayListExtra.size() == stringArrayListExtra2.size())) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean z = this.f204736e != ConversationSearchAct.f26693m && NullChecker.m82486a(stringArrayListExtra);
            for (int i = 0; i < stringArrayListExtra2.size(); i++) {
                Conversation conversationQuery = CoreModule.f18272k.f115545m.query(stringArrayListExtra2.get(i));
                if (z) {
                    Message messageQuery = CoreModule.f18272k.f115535c.query(stringArrayListExtra.get(i));
                    if (NullChecker.m82486a(conversationQuery) && NullChecker.m82486a(messageQuery)) {
                        arrayList.add(conversationQuery);
                        arrayList2.add(messageQuery);
                    }
                } else if (NullChecker.m82486a(conversationQuery)) {
                    arrayList.add(conversationQuery);
                }
            }
            if (NullChecker.m82486a(((gl6) this.viewModel).f104807k) && ((gl6) this.viewModel).f104807k.isFinishing()) {
                return;
            }
            int i2 = this.f204736e;
            if (i2 == ConversationSearchAct.f26693m) {
                m220062p0(arrayList, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), str);
            } else if (i2 == ConversationSearchAct.f26694n) {
                m220062p0(new ArrayList<>(), new ArrayList<>(), arrayList, arrayList2, str);
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m220061o0(final String str, final boolean z) {
        l51.m152886F(act(), new Runnable() { // from class: l.yk6
            @Override // java.lang.Runnable
            public final void run() {
                this.f200375a.m220057k0(z, str);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m220062p0(List<Conversation> list, List<User> list2, List<Conversation> list3, List<Message> list4, String str) {
        this.f204741j = list;
        this.f204742k = list2;
        this.f204743l = list3;
        this.f204744m = list4;
        ((gl6) this.viewModel).m130635v(list, list2, list3, list4, str);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m220063q0() {
        m220062p0(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), "");
        ((gl6) this.viewModel).m130637x(true);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m220064r0(final String str, final String str2) {
        if (this.f204732a) {
            this.f204733b = str;
            return;
        }
        this.f204732a = true;
        this.f204733b = null;
        l51.m152919y(new Runnable() { // from class: l.wk6
            @Override // java.lang.Runnable
            public final void run() {
                this.f189528a.m220059m0(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public void m220065s0(String str) {
        ((gl6) this.viewModel).m130636w(TextUtils.isEmpty(str.trim()));
        if (!TextUtils.isEmpty(str)) {
            m220064r0(str, "");
        } else if (this.f204732a) {
            this.f204733b = str;
        } else {
            m220063q0();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m220066t0(final String str) {
        l51.m152919y(new Runnable() { // from class: l.vk6
            @Override // java.lang.Runnable
            public final void run() {
                this.f184458a.m220060n0(str);
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}

package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.loveletter.LoveLetterEditAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class vdw extends ar2<dew> implements few {

    /* JADX INFO: renamed from: a */
    public pf60<List<Conversation>, List<User>> f183671a;

    /* JADX INFO: renamed from: b */
    public String f183672b;

    public vdw(ner nerVar) {
        super(nerVar);
        this.f183671a = pf60.m172085a(jyb.m147507f0(new Conversation[0]), jyb.m147507f0(new User[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m201003i0(Bundle bundle) {
        ((dew) this.viewModel).m115485r();
    }

    @Override // p153l.few
    /* JADX INFO: renamed from: R */
    public void mo125336R(String str) {
        Act act = act();
        if (act == null) {
            return;
        }
        act.startActivity(LoveLetterEditAct.m40566h2(act, str));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.rdw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162363a.m201003i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m201004j0(String str) {
        if (TextUtils.equals(this.f183672b, str)) {
            ((dew) this.viewModel).m115483n(jyb.m147522n(this.f183671a.f152156a, new qcj() { // from class: l.udw
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Conversation conversation = (Conversation) obj;
                    return Boolean.valueOf((conversation.f56859id.startsWith("-") || !TextUtils.equals(conversation.convType, "default") || TEnum.equals(conversation.status, "blocked")) ? false : true);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m201005k0(final String str) {
        List<Conversation> list = this.f183671a.f152156a;
        if (list != null) {
            list.clear();
        }
        List<User> list2 = this.f183671a.f152157b;
        if (list2 != null) {
            list2.clear();
        }
        if (TextUtils.equals(this.f183672b, str)) {
            this.f183671a = CoreModule.f18264c.f20384f0.m33895af(str);
            l51.m152886F(act(), new Runnable() { // from class: l.tdw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f173390a.m201004j0(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m201006l0(final String str) {
        this.f183672b = str;
        if (TextUtils.isEmpty(str.trim())) {
            ((dew) this.viewModel).m115483n(jyb.m147507f0(new Conversation[0]));
        } else {
            l51.m152919y(new Runnable() { // from class: l.sdw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f167469a.m201005k0(str);
                }
            });
        }
    }

    @Override // p153l.few
    public String pageId() {
        return "p_search_result";
    }

    @Override // p153l.few
    /* JADX INFO: renamed from: F */
    public void mo125335F() {
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    @Override // p153l.few
    /* JADX INFO: renamed from: r */
    public void mo125337r() {
    }
}

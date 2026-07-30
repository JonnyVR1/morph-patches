package p009l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.loveletter.LoveLetterEditAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import java.util.Collection;
import java.util.List;
import l.e30;
import l.e51;
import l.j760;
import l.jq2;
import l.mcr;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xbw extends jq2<fcw> implements hcw {

    /* JADX INFO: renamed from: a */
    public j760<List<Conversation>, List<User>> f22503a;

    /* JADX INFO: renamed from: b */
    public String f22504b;

    public xbw(mcr mcrVar) {
        super(mcrVar);
        this.f22503a = j760.a(vwb.f0(new Conversation[0]), vwb.f0(new User[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m24762i0(Bundle bundle) {
        ((fcw) ((jq2) this).viewModel).m14375r();
    }

    @Override // p009l.hcw
    /* JADX INFO: renamed from: R */
    public void mo15581R(String str) {
        Act act = act();
        if (act == null) {
            return;
        }
        act.startActivity(LoveLetterEditAct.m3634g2(act, str));
    }

    /* JADX INFO: renamed from: a0 */
    public void m24763a0() {
        super.a0();
        creates(new e30() { // from class: l.tbw
            public final void call(Object obj) {
                this.f20609a.m24762i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m24764j0(String str) {
        if (TextUtils.equals(this.f22504b, str)) {
            ((fcw) ((jq2) this).viewModel).m14373n(vwb.n((Collection) this.f22503a.a, new w9j() { // from class: l.wbw
                public final Object call(Object obj) {
                    Conversation conversation = (Conversation) obj;
                    return Boolean.valueOf((((DbObject) conversation).id.startsWith("-") || !TextUtils.equals(conversation.convType, "default") || TEnum.equals(conversation.status, "blocked")) ? false : true);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m24765k0(final String str) {
        Object obj = this.f22503a.a;
        if (obj != null) {
            ((List) obj).clear();
        }
        Object obj2 = this.f22503a.b;
        if (obj2 != null) {
            ((List) obj2).clear();
        }
        if (TextUtils.equals(this.f22504b, str)) {
            this.f22503a = CoreModule.c.f0.af(str);
            e51.F(act(), new Runnable() { // from class: l.vbw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21525a.m24764j0(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m24766l0(final String str) {
        this.f22504b = str;
        if (TextUtils.isEmpty(str.trim())) {
            ((fcw) ((jq2) this).viewModel).m14373n(vwb.f0(new Conversation[0]));
        } else {
            e51.y(new Runnable() { // from class: l.ubw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21060a.m24765k0(str);
                }
            });
        }
    }

    @Override // p009l.hcw
    public String pageId() {
        return "p_search_result";
    }

    @Override // p009l.hcw
    /* JADX INFO: renamed from: F */
    public void mo15580F() {
    }

    public void destroy() {
    }

    @Override // p009l.hcw
    /* JADX INFO: renamed from: r */
    public void mo15582r() {
    }
}

package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.loveletter.LoveLetterEditAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class xbw extends jq2<fcw> implements hcw {

    /* JADX INFO: renamed from: a */
    public j760<List<Conversation>, List<User>> f191969a;

    /* JADX INFO: renamed from: b */
    public String f191970b;

    public xbw(mcr mcrVar) {
        super(mcrVar);
        this.f191969a = j760.m140076a(vwb.m200324f0(new Conversation[0]), vwb.m200324f0(new User[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m207741i0(Bundle bundle) {
        ((fcw) this.viewModel).m120479r();
    }

    @Override // p149l.hcw
    /* JADX INFO: renamed from: R */
    public void mo130521R(String str) {
        Act act = act();
        if (act == null) {
            return;
        }
        act.startActivity(LoveLetterEditAct.m39563g2(act, str));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.tbw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169364a.m207741i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m207742j0(String str) {
        if (TextUtils.equals(this.f191970b, str)) {
            ((fcw) this.viewModel).m120477n(vwb.m200339n(this.f191969a.f116564a, new w9j() { // from class: l.wbw
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Conversation conversation = (Conversation) obj;
                    return Boolean.valueOf((conversation.f56011id.startsWith("-") || !TextUtils.equals(conversation.convType, "default") || TEnum.equals(conversation.status, "blocked")) ? false : true);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m207743k0(final String str) {
        List<Conversation> list = this.f191969a.f116564a;
        if (list != null) {
            list.clear();
        }
        List<User> list2 = this.f191969a.f116565b;
        if (list2 != null) {
            list2.clear();
        }
        if (TextUtils.equals(this.f191970b, str)) {
            this.f191969a = CoreModule.f17545c.f19642f0.m32892af(str);
            e51.m114741F(act(), new Runnable() { // from class: l.vbw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f180885a.m207742j0(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m207744l0(final String str) {
        this.f191970b = str;
        if (TextUtils.isEmpty(str.trim())) {
            ((fcw) this.viewModel).m120477n(vwb.m200324f0(new Conversation[0]));
        } else {
            e51.m114774y(new Runnable() { // from class: l.ubw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f175760a.m207743k0(str);
                }
            });
        }
    }

    @Override // p149l.hcw
    public String pageId() {
        return "p_search_result";
    }

    @Override // p149l.hcw
    /* JADX INFO: renamed from: F */
    public void mo130520F() {
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    @Override // p149l.hcw
    /* JADX INFO: renamed from: r */
    public void mo130522r() {
    }
}

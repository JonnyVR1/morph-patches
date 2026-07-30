package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SearchSchool;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class bma0 extends jq2<gma0> {
    public bma0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m102609g0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m102612k0(Bundle bundle) {
        ((gma0) this.viewModel).m126963L(((LoopInputType) ((gma0) this.viewModel).m126954B().getSerializable("loop_input_type")).title);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.wla0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186887a.m102612k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public void m102613j0(String str) {
        if (TextUtils.isEmpty(str)) {
            m102616n0(null);
        } else {
            m102615m0(str).subscribe(mkd0.m154956H(new e30() { // from class: l.xla0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f193402a.m102616n0((SearchSchool) obj);
                }
            }, new e30() { // from class: l.yla0
                @Override // p149l.e30
                public final void call(Object obj) {
                    bma0.m102609g0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final C22306c<SearchSchool> m102615m0(String str) {
        final String strM208761i = xh5.m208761i("/profile/schools?name=" + str);
        return CoreModule.f17545c.scheduled("getSuggestSchool", 0, new v9j() { // from class: l.zla0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135122f(new v9j() { // from class: l.ama0
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return qib0.f154693H.auth().m185898q(str).m185887f().m185883b();
                    }
                }, SearchSchool.JSON_ADAPTER).compose(mkd0.m154951C());
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m102616n0(SearchSchool searchSchool) {
        List<String> arrayList;
        if (!NullChecker.m81303a(searchSchool) || vwb.m200296J(searchSchool.data.schools)) {
            arrayList = new ArrayList<>();
            arrayList.add("其他");
        } else {
            arrayList = searchSchool.data.schools;
        }
        ((gma0) this.viewModel).m126962K(arrayList);
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l0 */
    public void m102614l0(int i, int i2, Intent intent) {
    }
}

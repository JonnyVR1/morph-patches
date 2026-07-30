package p002l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SearchSchool;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.ia20;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.qib0;
import l.v9j;
import l.vwb;
import l.xh5;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bma0 extends jq2<gma0> {
    public bma0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m10469g0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m10472k0(Bundle bundle) {
        ((gma0) ((jq2) this).viewModel).m13929L(((LoopInputType) ((gma0) ((jq2) this).viewModel).m13919B().getSerializable("loop_input_type")).title);
    }

    /* JADX INFO: renamed from: Z */
    public void m10473Z() {
        super.Z();
    }

    /* JADX INFO: renamed from: a0 */
    public void m10474a0() {
        super.a0();
        creates(new e30() { // from class: l.wla0
            public final void call(Object obj) {
                this.f21821a.m10472k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public void m10475j0(String str) {
        if (TextUtils.isEmpty(str)) {
            m10478n0(null);
        } else {
            m10477m0(str).subscribe(mkd0.H(new e30() { // from class: l.xla0
                public final void call(Object obj) {
                    this.f22346a.m10478n0((SearchSchool) obj);
                }
            }, new e30() { // from class: l.yla0
                public final void call(Object obj) {
                    bma0.m10469g0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final c<SearchSchool> m10477m0(String str) {
        final String strI = xh5.i("/profile/schools?name=" + str);
        return CoreModule.c.scheduled("getSuggestSchool", 0, new v9j() { // from class: l.zla0
            public final Object call() {
                return ia20.f(new v9j() { // from class: l.ama0
                    public final Object call() {
                        return qib0.H.auth().q(str).f().b();
                    }
                }, SearchSchool.JSON_ADAPTER).compose(mkd0.C());
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m10478n0(SearchSchool searchSchool) {
        List<String> arrayList;
        if (!NullChecker.a(searchSchool) || vwb.J(searchSchool.data.schools)) {
            arrayList = new ArrayList<>();
            arrayList.add("其他");
        } else {
            arrayList = searchSchool.data.schools;
        }
        ((gma0) ((jq2) this).viewModel).m13928K(arrayList);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l0 */
    public void m10476l0(int i, int i2, Intent intent) {
    }
}

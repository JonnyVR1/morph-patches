package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SearchSchool;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class fua0 extends ar2<kua0> {
    public fua0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m127442g0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m127445k0(Bundle bundle) {
        ((kua0) this.viewModel).m151495L(((LoopInputType) ((kua0) this.viewModel).m151486B().getSerializable("loop_input_type")).title);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.aua0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73479a.m127445k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public void m127446j0(String str) {
        if (TextUtils.isEmpty(str)) {
            m127449n0(null);
        } else {
            m127448m0(str).subscribe(psd0.m173597H(new y20() { // from class: l.bua0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f78475a.m127449n0((SearchSchool) obj);
                }
            }, new y20() { // from class: l.cua0
                @Override // p153l.y20
                public final void call(Object obj) {
                    fua0.m127442g0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final C22421c<SearchSchool> m127448m0(String str) {
        final String strM211107i = xi5.m211107i("/profile/schools?name=" + str);
        return CoreModule.f18264c.scheduled("getSuggestSchool", 0, new pcj() { // from class: l.dua0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176659f(new pcj() { // from class: l.eua0
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return uqb0.f180376H.auth().m209043q(str).m209032f().m209028b();
                    }
                }, SearchSchool.JSON_ADAPTER).compose(psd0.m173592C());
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m127449n0(SearchSchool searchSchool) {
        List<String> arrayList;
        if (!NullChecker.m82486a(searchSchool) || jyb.m147479J(searchSchool.data.schools)) {
            arrayList = new ArrayList<>();
            arrayList.add("其他");
        } else {
            arrayList = searchSchool.data.schools;
        }
        ((kua0) this.viewModel).m151494K(arrayList);
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l0 */
    public void m127447l0(int i, int i2, Intent intent) {
    }
}

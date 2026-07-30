package p153l;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.R$string;
import com.p051p1.mobile.android.p053ui.cropiwa.C4518c;
import com.p051p1.mobile.android.p053ui.cropiwa.CropperAct;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes8.dex */
public class gxb extends ar2<C4518c> {

    /* JADX INFO: renamed from: a */
    public String f106919a;

    /* JADX INFO: renamed from: b */
    public boolean f106920b;

    /* JADX INFO: renamed from: c */
    public boolean f106921c;

    /* JADX INFO: renamed from: d */
    public boolean f106922d;

    /* JADX INFO: renamed from: l.gxb$a */
    public class C17333a implements qcj<Bitmap, Integer> {
        public C17333a() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call(Bitmap bitmap) {
            return Integer.valueOf(sim.m186020a(bitmap));
        }
    }

    public gxb(ner nerVar) {
        super(nerVar);
        this.f106921c = false;
        this.f106922d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m132800m0(Bundle bundle) {
        m132801g0().setTitle((CharSequence) null);
        if (TextUtils.isEmpty(this.f106919a)) {
            CrashHelper.m82479c(new NullPointerException("imageUri is null"));
        }
        ((C4518c) this.viewModel).m22066k(this.f106919a);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.rwb
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165125a.m132800m0((Bundle) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: g0 */
    public CropperAct m132801g0() {
        return (CropperAct) super.act();
    }

    /* JADX INFO: renamed from: h0 */
    public void m132802h0() {
        ((C4518c) this.viewModel).m22065j(m132803i0());
    }

    /* JADX INFO: renamed from: i0 */
    public final ewb m132803i0() {
        ewb.C16850a c16850a = new ewb.C16850a(Uri.fromFile(ecj.m120381O(sim.m186021c() ? "webp" : "jpg")));
        c16850a.m122940b(sim.m186021c() ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG);
        if (sim.m186021c()) {
            c16850a.m122943e(new C17333a());
        }
        return c16850a.m122942d(1080, 1080).m122941c(100).m122939a();
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m132804j0() {
        return this.f106921c;
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m132805k0() {
        return this.f106922d;
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m132806l0() {
        return this.f106920b;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ boolean m132807n0(MenuItem menuItem) {
        if (((C4518c) this.viewModel).m22067l()) {
            m132801g0().progress(R$string.f15873k7);
            m132802h0();
            m132801g0().mo22055E1();
        }
        if (!m132806l0()) {
            return true;
        }
        i4g0.m138523u("e_picture_editing_page_operation_button", "p_picture_editing_page", pf60.m172085a("confirm_cancel_picture", BLiveVoiceSingTogehterState.confirm));
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    public void m132808o0(Menu menu) {
        menu.add(m132801g0().actionItemPadding(m132801g0().string(R$string.f15775b))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.wwb
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f191258a.m132807n0(menuItem);
            }
        }).setShowAsAction(2);
        m132801g0().pendChangeActionButtonTypeface();
    }

    /* JADX INFO: renamed from: p0 */
    public void m132809p0(boolean z) {
        this.f106920b = z;
    }

    /* JADX INFO: renamed from: q0 */
    public void m132810q0(String str) {
        this.f106919a = str;
    }

    /* JADX INFO: renamed from: r0 */
    public void m132811r0(boolean z) {
        this.f106922d = z;
    }

    /* JADX INFO: renamed from: s0 */
    public void m132812s0(boolean z) {
        this.f106921c = z;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}

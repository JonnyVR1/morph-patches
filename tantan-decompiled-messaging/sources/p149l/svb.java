package p149l;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.R$string;
import com.p046p1.mobile.android.p048ui.cropiwa.C4367c;
import com.p046p1.mobile.android.p048ui.cropiwa.CropperAct;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes8.dex */
public class svb extends jq2<C4367c> {

    /* JADX INFO: renamed from: a */
    public String f166550a;

    /* JADX INFO: renamed from: b */
    public boolean f166551b;

    /* JADX INFO: renamed from: c */
    public boolean f166552c;

    /* JADX INFO: renamed from: d */
    public boolean f166553d;

    /* JADX INFO: renamed from: l.svb$a */
    public class C20038a implements w9j<Bitmap, Integer> {
        public C20038a() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call(Bitmap bitmap) {
            return Integer.valueOf(pgm.m168759a(bitmap));
        }
    }

    public svb(mcr mcrVar) {
        super(mcrVar);
        this.f166552c = false;
        this.f166553d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m186052m0(Bundle bundle) {
        m186053g0().setTitle((CharSequence) null);
        if (TextUtils.isEmpty(this.f166550a)) {
            CrashHelper.m81296c(new NullPointerException("imageUri is null"));
        }
        ((C4367c) this.viewModel).m21067k(this.f166550a);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.dvb
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88052a.m186052m0((Bundle) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: g0 */
    public CropperAct m186053g0() {
        return (CropperAct) super.act();
    }

    /* JADX INFO: renamed from: h0 */
    public void m186054h0() {
        ((C4367c) this.viewModel).m21066j(m186055i0());
    }

    /* JADX INFO: renamed from: i0 */
    public final qub m186055i0() {
        qub.C19581a c19581a = new qub.C19581a(Uri.fromFile(k9j.m145083O(pgm.m168760c() ? "webp" : "jpg")));
        c19581a.m176593b(pgm.m168760c() ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG);
        if (pgm.m168760c()) {
            c19581a.m176596e(new C20038a());
        }
        return c19581a.m176595d(1080, 1080).m176594c(100).m176592a();
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m186056j0() {
        return this.f166552c;
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m186057k0() {
        return this.f166553d;
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m186058l0() {
        return this.f166551b;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ boolean m186059n0(MenuItem menuItem) {
        if (((C4367c) this.viewModel).m21068l()) {
            m186053g0().progress(R$string.f15154k7);
            m186054h0();
            m186053g0().mo21056C1();
        }
        if (!m186058l0()) {
            return true;
        }
        zvf0.m220399u("e_picture_editing_page_operation_button", "p_picture_editing_page", j760.m140076a("confirm_cancel_picture", BLiveVoiceSingTogehterState.confirm));
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    public void m186060o0(Menu menu) {
        menu.add(m186053g0().actionItemPadding(m186053g0().string(R$string.f15056b))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ivb
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f115109a.m186059n0(menuItem);
            }
        }).setShowAsAction(2);
        m186053g0().pendChangeActionButtonTypeface();
    }

    /* JADX INFO: renamed from: p0 */
    public void m186061p0(boolean z) {
        this.f166551b = z;
    }

    /* JADX INFO: renamed from: q0 */
    public void m186062q0(String str) {
        this.f166550a = str;
    }

    /* JADX INFO: renamed from: r0 */
    public void m186063r0(boolean z) {
        this.f166553d = z;
    }

    /* JADX INFO: renamed from: s0 */
    public void m186064s0(boolean z) {
        this.f166552c = z;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}

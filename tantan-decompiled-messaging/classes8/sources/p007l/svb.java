package p007l;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.R$string;
import com.p003p1.mobile.android.p005ui.cropiwa.C0279c;
import com.p003p1.mobile.android.p005ui.cropiwa.CropperAct;
import com.tantanapp.common.utils.CrashHelper;
import l.e30;
import l.j760;
import l.w9j;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class svb extends jq2<C0279c> {

    /* JADX INFO: renamed from: a */
    public String f4187a;

    /* JADX INFO: renamed from: b */
    public boolean f4188b;

    /* JADX INFO: renamed from: c */
    public boolean f4189c;

    /* JADX INFO: renamed from: d */
    public boolean f4190d;

    /* JADX INFO: renamed from: l.svb$a */
    public class C0700a implements w9j<Bitmap, Integer> {
        public C0700a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call(Bitmap bitmap) {
            return Integer.valueOf(pgm.m10253a(bitmap));
        }
    }

    public svb(mcr mcrVar) {
        super(mcrVar);
        this.f4189c = false;
        this.f4190d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m10734m0(Bundle bundle) {
        m10735g0().setTitle((CharSequence) null);
        if (TextUtils.isEmpty(this.f4187a)) {
            CrashHelper.c(new NullPointerException("imageUri is null"));
        }
        ((C0279c) this.viewModel).m1339k(this.f4187a);
    }

    @Override // p007l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo8872a0() {
        creates(new e30() { // from class: l.dvb
            public final void call(Object obj) {
                this.f2605a.m10734m0((Bundle) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: g0 */
    public CropperAct m10735g0() {
        return (CropperAct) super.act();
    }

    /* JADX INFO: renamed from: h0 */
    public void m10736h0() {
        ((C0279c) this.viewModel).m1338j(m10737i0());
    }

    /* JADX INFO: renamed from: i0 */
    public final qub m10737i0() {
        qub.C0676a c0676a = new qub.C0676a(Uri.fromFile(k9j.m9572O(pgm.m10254c() ? "webp" : "jpg")));
        c0676a.m10465b(pgm.m10254c() ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG);
        if (pgm.m10254c()) {
            c0676a.m10468e(new C0700a());
        }
        return c0676a.m10467d(1080, 1080).m10466c(100).m10464a();
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m10738j0() {
        return this.f4189c;
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m10739k0() {
        return this.f4190d;
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m10740l0() {
        return this.f4188b;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ boolean m10741n0(MenuItem menuItem) {
        if (((C0279c) this.viewModel).m1340l()) {
            m10735g0().progress(R$string.f853k7);
            m10736h0();
            m10735g0().m1328C1();
        }
        if (!m10740l0()) {
            return true;
        }
        zvf0.u("e_picture_editing_page_operation_button", "p_picture_editing_page", new j760[]{j760.a("confirm_cancel_picture", "confirm")});
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    public void m10742o0(Menu menu) {
        menu.add(m10735g0().actionItemPadding(m10735g0().string(R$string.f755b))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ivb
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f2939a.m10741n0(menuItem);
            }
        }).setShowAsAction(2);
        m10735g0().pendChangeActionButtonTypeface();
    }

    /* JADX INFO: renamed from: p0 */
    public void m10743p0(boolean z) {
        this.f4188b = z;
    }

    /* JADX INFO: renamed from: q0 */
    public void m10744q0(String str) {
        this.f4187a = str;
    }

    /* JADX INFO: renamed from: r0 */
    public void m10745r0(boolean z) {
        this.f4190d = z;
    }

    /* JADX INFO: renamed from: s0 */
    public void m10746s0(boolean z) {
        this.f4189c = z;
    }

    @Override // p007l.q0m
    public void destroy() {
    }
}

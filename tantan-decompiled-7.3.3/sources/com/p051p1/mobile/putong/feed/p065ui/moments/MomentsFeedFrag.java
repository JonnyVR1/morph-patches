package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.uv00;
import p153l.uxj0;

/* JADX INFO: loaded from: classes13.dex */
public class MomentsFeedFrag extends PutongMvpFrag<uv00, C11573b> {

    /* JADX INFO: renamed from: B */
    public boolean f44730B = true;

    /* JADX INFO: renamed from: C */
    public boolean f44731C = true;

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    /* JADX INFO: renamed from: O4 */
    public void m68016O4(boolean z) {
        ((C11573b) this.f17893A).m68241q(z);
    }

    /* JADX INFO: renamed from: P4 */
    public void m68017P4() {
        ((C11573b) this.f17893A).m68242s();
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public uv00 mo30639M4() {
        return new uv00(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public C11573b mo30640N4() {
        return new C11573b(this);
    }

    /* JADX INFO: renamed from: S4 */
    public boolean m68020S4() {
        return ((uv00) this.f17894z).m198233n0();
    }

    /* JADX INFO: renamed from: T4 */
    public void m68021T4(List<Media> list) {
        ((C11573b) this.f17893A).m68235G(list);
    }

    /* JADX INFO: renamed from: U4 */
    public void m68022U4(boolean z) {
        ((uv00) this.f17894z).m198238t0(z);
    }

    /* JADX INFO: renamed from: V4 */
    public C11573b m68023V4() {
        return (C11573b) this.f17893A;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((C11573b) this.f17893A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (NullChecker.m82486a(this.f17893A)) {
            ((C11573b) this.f17893A).m68234F(i, i2, intent);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (NullChecker.m82486a(this.f17894z)) {
            ((uv00) this.f17894z).f181106b.onNext(uxj0.f181467a);
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f44731C && this.f44730B) {
            ((uv00) this.f17894z).m198237s0();
            this.f44731C = false;
            this.f44730B = false;
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return uv00.pageId();
    }
}

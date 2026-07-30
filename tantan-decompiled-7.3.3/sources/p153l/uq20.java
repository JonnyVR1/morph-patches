package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.data.NewMomentDraft;
import com.p051p1.mobile.putong.feed.newui.mediapicker.newcaption.NewCaptionAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class uq20 extends ar2<jr20> {

    /* JADX INFO: renamed from: a */
    public NewCaptionAct f180344a;

    /* JADX INFO: renamed from: b */
    public ArrayList<Media> f180345b;

    public uq20(NewCaptionAct newCaptionAct) {
        super(newCaptionAct);
        this.f180345b = new ArrayList<>();
        this.f180344a = newCaptionAct;
    }

    /* JADX INFO: renamed from: f0 */
    public ArrayList<Media> m197200f0() {
        if (this.f180345b == null) {
            this.f180345b = new ArrayList<>();
        }
        return this.f180345b;
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m197201g0() {
        return m197202h0() || ((jr20) this.viewModel).m146691q();
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m197202h0() {
        ArrayList<Media> arrayList = this.f180345b;
        return arrayList != null && arrayList.size() > 0;
    }

    /* JADX INFO: renamed from: i0 */
    public void m197203i0() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.tq20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175672a.m197204j0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m197204j0(C4470c c4470c) {
        if (c4470c instanceof C4470c.a) {
            ((jr20) this.viewModel).m146693u();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m197205k0(int i, int i2, Intent intent) {
        if (i != cn40.f82681a || i2 != -1) {
            if (i == 1) {
                uqb0.f180370E.m80051t();
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("framePath");
        if (TextUtils.isEmpty(stringExtra) || !(this.f180345b.get(0) instanceof Video)) {
            return;
        }
        this.f180345b.get(0).cover().url = oki.m168011B(stringExtra);
        ((jr20) this.viewModel).m146696x(this.f180345b);
    }

    /* JADX INFO: renamed from: l0 */
    public void m197206l0(Intent intent) {
        if (NullChecker.m82487b(intent) && NullChecker.m82486a(intent.getSerializableExtra("extra_images"))) {
            this.f180345b.addAll((ArrayList) intent.getSerializableExtra("extra_images"));
            ((jr20) this.viewModel).m146697y(this.f180345b);
        }
        m197209o0();
    }

    /* JADX INFO: renamed from: m0 */
    public void m197207m0(Intent intent, Bundle bundle) {
        this.f180345b = (ArrayList) intent.getSerializableExtra("extra_images");
        if (NullChecker.m82486a(bundle)) {
            this.f180345b = (ArrayList) bundle.getSerializable("extra_images");
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m197208n0(NewMomentDraft newMomentDraft) {
        if (newMomentDraft == null) {
            return;
        }
        ((jr20) this.viewModel).m146698z(newMomentDraft.text);
        ArrayList<Media> arrayList = (ArrayList) newMomentDraft.images;
        this.f180345b = arrayList;
        ((jr20) this.viewModel).m146696x(arrayList);
    }

    /* JADX INFO: renamed from: o0 */
    public void m197209o0() {
        this.f180344a.m63847M2();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}

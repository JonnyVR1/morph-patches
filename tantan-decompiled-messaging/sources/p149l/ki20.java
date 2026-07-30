package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.data.NewMomentDraft;
import com.p046p1.mobile.putong.feed.newui.mediapicker.newcaption.NewCaptionAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class ki20 extends jq2<zi20> {

    /* JADX INFO: renamed from: a */
    public NewCaptionAct f123259a;

    /* JADX INFO: renamed from: b */
    public ArrayList<Media> f123260b;

    public ki20(NewCaptionAct newCaptionAct) {
        super(newCaptionAct);
        this.f123260b = new ArrayList<>();
        this.f123259a = newCaptionAct;
    }

    /* JADX INFO: renamed from: f0 */
    public ArrayList<Media> m146042f0() {
        if (this.f123260b == null) {
            this.f123260b = new ArrayList<>();
        }
        return this.f123260b;
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m146043g0() {
        return m146044h0() || ((zi20) this.viewModel).m218924q();
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m146044h0() {
        ArrayList<Media> arrayList = this.f123260b;
        return arrayList != null && arrayList.size() > 0;
    }

    /* JADX INFO: renamed from: i0 */
    public void m146045i0() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.ji20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118044a.m146046j0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m146046j0(C4319c c4319c) {
        if (c4319c instanceof C4319c.a) {
            ((zi20) this.viewModel).m218926u();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m146047k0(int i, int i2, Intent intent) {
        if (i != oe40.f143278a || i2 != -1) {
            if (i == 1) {
                qib0.f154687E.m78868t();
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("framePath");
        if (TextUtils.isEmpty(stringExtra) || !(this.f123260b.get(0) instanceof Video)) {
            return;
        }
        this.f123260b.get(0).cover().url = rhi.m179355B(stringExtra);
        ((zi20) this.viewModel).m218929x(this.f123260b);
    }

    /* JADX INFO: renamed from: l0 */
    public void m146048l0(Intent intent) {
        if (NullChecker.m81304b(intent) && NullChecker.m81303a(intent.getSerializableExtra("extra_images"))) {
            this.f123260b.addAll((ArrayList) intent.getSerializableExtra("extra_images"));
            ((zi20) this.viewModel).m218930y(this.f123260b);
        }
        m146051o0();
    }

    /* JADX INFO: renamed from: m0 */
    public void m146049m0(Intent intent, Bundle bundle) {
        this.f123260b = (ArrayList) intent.getSerializableExtra("extra_images");
        if (NullChecker.m81303a(bundle)) {
            this.f123260b = (ArrayList) bundle.getSerializable("extra_images");
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m146050n0(NewMomentDraft newMomentDraft) {
        if (newMomentDraft == null) {
            return;
        }
        ((zi20) this.viewModel).m218931z(newMomentDraft.text);
        ArrayList<Media> arrayList = (ArrayList) newMomentDraft.images;
        this.f123260b = arrayList;
        ((zi20) this.viewModel).m218929x(arrayList);
    }

    /* JADX INFO: renamed from: o0 */
    public void m146051o0() {
        this.f123259a.m62664L2();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}

package p007l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.data.NewMomentDraft;
import com.p000p1.mobile.putong.feed.newui.mediapicker.newcaption.NewCaptionAct;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e30;
import l.jq2;
import l.mkd0;
import l.qib0;
import l.rhi;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ki20 extends jq2<zi20> {

    /* JADX INFO: renamed from: a */
    public NewCaptionAct f9722a;

    /* JADX INFO: renamed from: b */
    public ArrayList<Media> f9723b;

    public ki20(NewCaptionAct newCaptionAct) {
        super(newCaptionAct);
        this.f9723b = new ArrayList<>();
        this.f9722a = newCaptionAct;
    }

    /* JADX INFO: renamed from: f0 */
    public ArrayList<Media> m11426f0() {
        if (this.f9723b == null) {
            this.f9723b = new ArrayList<>();
        }
        return this.f9723b;
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m11427g0() {
        return m11428h0() || ((zi20) ((jq2) this).viewModel).m17415q();
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m11428h0() {
        ArrayList<Media> arrayList = this.f9723b;
        return arrayList != null && arrayList.size() > 0;
    }

    /* JADX INFO: renamed from: i0 */
    public void m11429i0() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ji20
            public final void call(Object obj) {
                this.f9367a.m11430j0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m11430j0(c cVar) {
        if (cVar instanceof c.a) {
            ((zi20) ((jq2) this).viewModel).m17417u();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m11431k0(int i, int i2, Intent intent) {
        if (i != oe40.f11441a || i2 != -1) {
            if (i == 1) {
                qib0.E.t();
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("framePath");
        if (TextUtils.isEmpty(stringExtra) || !(this.f9723b.get(0) instanceof Video)) {
            return;
        }
        this.f9723b.get(0).cover().url = rhi.B(stringExtra);
        ((zi20) ((jq2) this).viewModel).m17420x(this.f9723b);
    }

    /* JADX INFO: renamed from: l0 */
    public void m11432l0(Intent intent) {
        if (NullChecker.b(intent) && NullChecker.a(intent.getSerializableExtra("extra_images"))) {
            this.f9723b.addAll((ArrayList) intent.getSerializableExtra("extra_images"));
            ((zi20) ((jq2) this).viewModel).m17421y(this.f9723b);
        }
        m11435o0();
    }

    /* JADX INFO: renamed from: m0 */
    public void m11433m0(Intent intent, Bundle bundle) {
        this.f9723b = (ArrayList) intent.getSerializableExtra("extra_images");
        if (NullChecker.a(bundle)) {
            this.f9723b = (ArrayList) bundle.getSerializable("extra_images");
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m11434n0(NewMomentDraft newMomentDraft) {
        if (newMomentDraft == null) {
            return;
        }
        ((zi20) ((jq2) this).viewModel).m17422z(newMomentDraft.text);
        ArrayList<Media> arrayList = (ArrayList) newMomentDraft.images;
        this.f9723b = arrayList;
        ((zi20) ((jq2) this).viewModel).m17420x(arrayList);
    }

    /* JADX INFO: renamed from: o0 */
    public void m11435o0() {
        this.f9722a.m3669L2();
    }

    public void destroy() {
    }
}

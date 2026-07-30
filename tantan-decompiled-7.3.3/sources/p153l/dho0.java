package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.BottomVoicePlayItemView;

/* JADX INFO: loaded from: classes5.dex */
public class dho0 extends ic3<BottomVoicePlayItemView> {

    /* JADX INFO: renamed from: l */
    public jc3<?> f88546l;

    public dho0(String str, CharSequence charSequence, int i, int i2, String str2, jc3<?> jc3Var) {
        super(str, charSequence, i, i2, str2);
        this.f88546l = jc3Var;
    }

    @Override // p153l.ic3, p153l.d3q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo71749u(BottomVoicePlayItemView bottomVoicePlayItemView) {
        super.mo71749u(bottomVoicePlayItemView);
        int i = this.f114273d;
        if (i != 0) {
            bottomVoicePlayItemView.setImageRes(i);
        } else if (!TextUtils.isEmpty(this.f114274e)) {
            bottomVoicePlayItemView.setImageUrl(this.f114274e);
        }
        bottomVoicePlayItemView.f49352e.setTextColor(n3d0.m161277a(n9c0.f140847m1));
        bottomVoicePlayItemView.f49352e.setTextSize(12.0f);
        bottomVoicePlayItemView.setText(this.f114275f);
        int iMo112223E = this.f88546l.mo112223E();
        jc3<?> jc3Var = this.f88546l;
        if (iMo112223E > 0) {
            bottomVoicePlayItemView.m73330b(jc3Var.mo112223E());
        } else {
            bottomVoicePlayItemView.mo73321g0(jc3Var.mo103476l1());
        }
        bnl0.m105507D0((int) ((bnl0.m105592y0() - qa00.m175859d(85.0f)) / 4.0f), bottomVoicePlayItemView, bottomVoicePlayItemView.f49348a);
        int i2 = this.f114280k;
        if (i2 > 0) {
            bnl0.m105505C0(bottomVoicePlayItemView.f49352e, i2);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198691A;
    }
}

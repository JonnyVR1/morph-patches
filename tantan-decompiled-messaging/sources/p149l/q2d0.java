package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightEquipTextItemView;

/* JADX INFO: loaded from: classes13.dex */
public class q2d0 extends d1q<RightEquipTextItemView> {

    /* JADX INFO: renamed from: a */
    public String f152228a;

    public q2d0(String str) {
        this.f152228a = "";
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f152228a = str;
    }

    /* JADX INFO: renamed from: H */
    public String m172435H() {
        return this.f152228a;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70566u(RightEquipTextItemView rightEquipTextItemView) {
        super.mo70566u(rightEquipTextItemView);
        rightEquipTextItemView.m70615o(this);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162765j1;
    }
}

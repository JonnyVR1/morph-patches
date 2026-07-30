package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightEquipTextItemView;

/* JADX INFO: loaded from: classes9.dex */
public class tad0 extends d3q<RightEquipTextItemView> {

    /* JADX INFO: renamed from: a */
    public String f172715a;

    public tad0(String str) {
        this.f172715a = "";
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f172715a = str;
    }

    /* JADX INFO: renamed from: H */
    public String m189836H() {
        return this.f172715a;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo71749u(RightEquipTextItemView rightEquipTextItemView) {
        super.mo71749u(rightEquipTextItemView);
        rightEquipTextItemView.m71798o(this);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193879j1;
    }
}

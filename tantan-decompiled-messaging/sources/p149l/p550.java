package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowListItem;
import com.p046p1.mobile.putong.live.livingroom.officialshow.showlist.OfficialShowPlayBillItemView;

/* JADX INFO: loaded from: classes4.dex */
public class p550 extends d1q<OfficialShowPlayBillItemView> {

    /* JADX INFO: renamed from: a */
    public final BLiveOfficialShowListItem f147258a;

    /* JADX INFO: renamed from: b */
    public final a650 f147259b;

    public p550(a650 a650Var, BLiveOfficialShowListItem bLiveOfficialShowListItem) {
        this.f147258a = bLiveOfficialShowListItem;
        this.f147259b = a650Var;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(OfficialShowPlayBillItemView officialShowPlayBillItemView) {
        super.mo70566u(officialShowPlayBillItemView);
        officialShowPlayBillItemView.m75404e(this.f147259b, this.f147258a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168048H4;
    }
}

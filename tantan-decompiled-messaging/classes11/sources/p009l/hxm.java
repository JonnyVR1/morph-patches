package p009l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedBasicInfoRootLayout;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.LabelData;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import l.ixm;
import l.vwb;
import l.w9j;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hxm extends p3l {

    /* JADX INFO: renamed from: f */
    public ExpandedBasicInfoRootLayout f14277f;

    /* JADX INFO: renamed from: g */
    public VLinear f14278g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f14279h;

    /* JADX INFO: renamed from: i */
    public ExpandedCardCommonLabelView f14280i;

    /* JADX INFO: renamed from: l.hxm$a */
    public class C0942a implements Consumer<Tag> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f14281a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f14282b;

        public C0942a(ArrayList arrayList, List list) {
            this.f14281a = arrayList;
            this.f14282b = list;
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Tag tag) {
            LabelData labelDataNew_ = LabelData.new_();
            labelDataNew_.name = tag.value;
            labelDataNew_.highlight = this.f14281a.contains(tag);
            this.f14282b.add(labelDataNew_);
        }
    }

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!user.isMe()) {
            arrayList2 = vwb.n(user.profile.tags, new w9j() { // from class: l.fxm
                public final Object call(Object obj) {
                    Tag tag = (Tag) obj;
                    return Boolean.valueOf(CoreModule.K().me_().profile.tags.contains(tag) && !TextUtils.equals(tag.category, "personality"));
                }
            });
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        VText_Medium vText_Medium = this.f14279h;
        if (zIsEmpty) {
            vText_Medium.setText(App.e.getString(R.string.il));
        } else {
            vText_Medium.setText(arrayList2.size() + " " + App.e.getString(R.string.Ef));
        }
        vwb.n(user.profile.tags, new w9j() { // from class: l.gxm
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.equals(((Tag) obj).category, "personality"));
            }
        }).forEach(new C0942a(arrayList2, arrayList));
        this.f14280i.m2212e();
        this.f14280i.m2211d(arrayList);
    }

    /* JADX INFO: renamed from: F */
    public final void m16009F(View view) {
        ixm.a(this, view);
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
        super.mo2127g(view);
        m16009F(view);
    }
}

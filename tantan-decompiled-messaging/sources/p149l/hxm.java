package p149l;

import android.text.TextUtils;
import android.view.View;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.LabelData;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedBasicInfoRootLayout;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import p147v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class hxm extends p3l {

    /* JADX INFO: renamed from: f */
    public ExpandedBasicInfoRootLayout f109886f;

    /* JADX INFO: renamed from: g */
    public VLinear f109887g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f109888h;

    /* JADX INFO: renamed from: i */
    public ExpandedCardCommonLabelView f109889i;

    /* JADX INFO: renamed from: l.hxm$a */
    public class C17427a implements Consumer<Tag> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f109890a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f109891b;

        public C17427a(ArrayList arrayList, List list) {
            this.f109890a = arrayList;
            this.f109891b = list;
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Tag tag) {
            LabelData labelDataNew_ = LabelData.new_();
            labelDataNew_.name = tag.value;
            labelDataNew_.highlight = this.f109890a.contains(tag);
            this.f109891b.add(labelDataNew_);
        }
    }

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!user.isMe()) {
            arrayList2 = vwb.m200339n(user.profile.tags, new w9j() { // from class: l.fxm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Tag tag = (Tag) obj;
                    return Boolean.valueOf(CoreModule.m29932K().me_().profile.tags.contains(tag) && !TextUtils.equals(tag.category, "personality"));
                }
            });
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        VText_Medium vText_Medium = this.f109888h;
        if (zIsEmpty) {
            vText_Medium.setText(App.f15369e.getString(R$string.f18614il));
        } else {
            vText_Medium.setText(arrayList2.size() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + App.f15369e.getString(R$string.f17702Ef));
        }
        vwb.m200339n(user.profile.tags, new w9j() { // from class: l.gxm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.equals(((Tag) obj).category, "personality"));
            }
        }).forEach(new C17427a(arrayList2, arrayList));
        this.f109889i.m38234e();
        this.f109889i.m38233d(arrayList);
    }

    /* JADX INFO: renamed from: F */
    public final void m133348F(View view) {
        ixm.m138874a(this, view);
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
        super.mo38153g(view);
        m133348F(view);
    }
}

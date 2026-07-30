package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.LabelData;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedBasicInfoRootLayout;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import p151v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class xyk extends f6l {

    /* JADX INFO: renamed from: f */
    public ExpandedBasicInfoRootLayout f196756f;

    /* JADX INFO: renamed from: g */
    public VLinear f196757g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f196758h;

    /* JADX INFO: renamed from: i */
    public ExpandedCardCommonLabelView f196759i;

    /* JADX INFO: renamed from: l.xyk$a */
    public class C21478a implements Consumer<Tag> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f196760a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f196761b;

        public C21478a(ArrayList arrayList, List list) {
            this.f196760a = arrayList;
            this.f196761b = list;
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Tag tag) {
            LabelData labelDataNew_ = LabelData.new_();
            labelDataNew_.name = tag.value;
            labelDataNew_.highlight = this.f196760a.contains(tag);
            this.f196761b.add(labelDataNew_);
        }
    }

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!user.isMe()) {
            arrayList2 = jyb.m147522n(user.profile.tags, new qcj() { // from class: l.vyk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Tag tag = (Tag) obj;
                    return Boolean.valueOf(CoreModule.m30930K().me_().profile.tags.contains(tag) && TextUtils.equals(tag.category, "personality"));
                }
            });
        }
        jyb.m147522n(user.profile.tags, new qcj() { // from class: l.wyk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Tag) obj).category, "personality"));
            }
        }).forEach(new C21478a(arrayList2, arrayList));
        this.f196759i.m39237e();
        this.f196759i.m39236d(arrayList);
    }

    /* JADX INFO: renamed from: F */
    public final void m213629F(View view) {
        yyk.m217996a(this, view);
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m213629F(view);
    }
}

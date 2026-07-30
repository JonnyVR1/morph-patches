package p153l;

import android.text.TextUtils;
import android.view.View;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
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
public class hzm extends f6l {

    /* JADX INFO: renamed from: f */
    public ExpandedBasicInfoRootLayout f112265f;

    /* JADX INFO: renamed from: g */
    public VLinear f112266g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f112267h;

    /* JADX INFO: renamed from: i */
    public ExpandedCardCommonLabelView f112268i;

    /* JADX INFO: renamed from: l.hzm$a */
    public class C17604a implements Consumer<Tag> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f112269a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f112270b;

        public C17604a(ArrayList arrayList, List list) {
            this.f112269a = arrayList;
            this.f112270b = list;
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Tag tag) {
            LabelData labelDataNew_ = LabelData.new_();
            labelDataNew_.name = tag.value;
            labelDataNew_.highlight = this.f112269a.contains(tag);
            this.f112270b.add(labelDataNew_);
        }
    }

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!user.isMe()) {
            arrayList2 = jyb.m147522n(user.profile.tags, new qcj() { // from class: l.fzm
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Tag tag = (Tag) obj;
                    return Boolean.valueOf(CoreModule.m30930K().me_().profile.tags.contains(tag) && !TextUtils.equals(tag.category, "personality"));
                }
            });
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        VText_Medium vText_Medium = this.f112267h;
        if (zIsEmpty) {
            vText_Medium.setText(App.f16088e.getString(R$string.f18431El));
        } else {
            vText_Medium.setText(arrayList2.size() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + App.f16088e.getString(R$string.f18972Wf));
        }
        jyb.m147522n(user.profile.tags, new qcj() { // from class: l.gzm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.equals(((Tag) obj).category, "personality"));
            }
        }).forEach(new C17604a(arrayList2, arrayList));
        this.f112268i.m39237e();
        this.f112268i.m39236d(arrayList);
    }

    /* JADX INFO: renamed from: F */
    public final void m137903F(View view) {
        izm.m142812a(this, view);
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m137903F(view);
    }
}

package p153l;

import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.FeedbackQuestion;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes3.dex */
public class uwb0 implements sxl0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f181253a;

    /* JADX INFO: renamed from: b */
    public Act f181254b;

    /* JADX INFO: renamed from: l.uwb0$a */
    public class ViewOnLayoutChangeListenerC20686a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LinearLayout f181255a;

        public ViewOnLayoutChangeListenerC20686a(LinearLayout linearLayout) {
            this.f181255a = linearLayout;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i4 - i2 > qa00.m175859d(400.0f)) {
                for (int i9 = 0; i9 < this.f181255a.getChildCount(); i9++) {
                    View childAt = this.f181255a.getChildAt(i9);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    layoutParams.height = qa00.m175859d(72.0f);
                    layoutParams.weight = 0.0f;
                    childAt.setLayoutParams(layoutParams);
                }
            } else {
                for (int i10 = 0; i10 < this.f181255a.getChildCount(); i10++) {
                    View childAt2 = this.f181255a.getChildAt(i10);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                    layoutParams2.height = 0;
                    layoutParams2.weight = 1.0f;
                    childAt2.setLayoutParams(layoutParams2);
                }
            }
            this.f181255a.removeOnLayoutChangeListener(this);
        }
    }

    public uwb0(NewNewHomeFrag newNewHomeFrag) {
        this.f181253a = newNewHomeFrag;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(kec0.f125951mb, viewGroup, false);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        this.f181254b = (Act) bnl0.m105508E(view);
        List<FeedbackQuestion> listM32597R3 = CoreModule.f18264c.f20294B0.m32597R3();
        VDraweeView vDraweeView = (VDraweeView) view.findViewById(adc0.f70480o0);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(adc0.f70373hb);
        uqb0.f180374G.m127115L0(vDraweeView, "https://auto.tancdn.com/v1/raw/28687c8d-6e5d-4ab7-8f1f-1a232c3816df14.webp");
        linearLayout.removeAllViews();
        for (final FeedbackQuestion feedbackQuestion : listM32597R3) {
            VText_Medium vText_Medium = new VText_Medium(this.f181254b);
            vText_Medium.setTextSize(15.0f);
            vText_Medium.setGravity(17);
            vText_Medium.setTextColor(this.f181254b.getResources().getColor(c9c0.f80445p));
            vText_Medium.setText(feedbackQuestion.text);
            float f = qa00.f156323j;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
            shapeDrawable.getPaint().setColor(Color.parseColor("#D8F5FF"));
            vText_Medium.setBackground(shapeDrawable);
            vText_Medium.setMaxHeight(qa00.m175859d(72.0f));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            layoutParams.bottomMargin = qa00.f156322i;
            linearLayout.addView(vText_Medium, layoutParams);
            bnl0.m105509E0(vText_Medium, new View.OnClickListener() { // from class: l.swb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f170937a.m198347j(feedbackQuestion, view3);
                }
            });
        }
        linearLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC20686a(linearLayout));
        i4g0.m138526x("e_swipe_noverify_inquiry", this.f181254b.pageId());
        CoreModule.f18264c.f20294B0.m32622r4("card");
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m198347j(FeedbackQuestion feedbackQuestion, View view) {
        this.f181253a.f22420C.m38128A2().mo39804A(SwipeDirection.RIGHT);
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        if (partialListOptM222761e != null && partialListOptM222761e.loaded.size() == 1) {
            l51.m152887G(new Runnable() { // from class: l.twb0
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20405m0.m32130m8();
                }
            });
        }
        Uri uri = Uri.parse(feedbackQuestion.data);
        List<String> queryParameters = uri.getQueryParameters("stat_id");
        i4g0.m138523u("e_swipe_noverify_inquiry", this.f181254b.pageId(), jyb.m147494Y("inquiry_source", jyb.m147479J(queryParameters) ? "" : queryParameters.get(0)));
        xwa.m213304D(this.f181254b, uri);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(VSwipeCard vSwipeCard) {
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(View view) {
    }
}

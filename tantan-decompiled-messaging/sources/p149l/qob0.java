package p149l;

import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.FeedbackQuestion;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class qob0 implements ool0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f155547a;

    /* JADX INFO: renamed from: b */
    public Act f155548b;

    /* JADX INFO: renamed from: l.qob0$a */
    public class ViewOnLayoutChangeListenerC19545a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LinearLayout f155549a;

        public ViewOnLayoutChangeListenerC19545a(LinearLayout linearLayout) {
            this.f155549a = linearLayout;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i4 - i2 > t100.m186890d(400.0f)) {
                for (int i9 = 0; i9 < this.f155549a.getChildCount(); i9++) {
                    View childAt = this.f155549a.getChildAt(i9);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    layoutParams.height = t100.m186890d(72.0f);
                    layoutParams.weight = 0.0f;
                    childAt.setLayoutParams(layoutParams);
                }
            } else {
                for (int i10 = 0; i10 < this.f155549a.getChildCount(); i10++) {
                    View childAt2 = this.f155549a.getChildAt(i10);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                    layoutParams2.height = 0;
                    layoutParams2.weight = 1.0f;
                    childAt2.setLayoutParams(layoutParams2);
                }
            }
            this.f155549a.removeOnLayoutChangeListener(this);
        }
    }

    public qob0(NewNewHomeFrag newNewHomeFrag) {
        this.f155547a = newNewHomeFrag;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(f6c0.f95779fb, viewGroup, false);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        this.f155548b = (Act) xdl0.m208328E(view);
        List<FeedbackQuestion> listM31594R3 = CoreModule.f17545c.f19552B0.m31594R3();
        VDraweeView vDraweeView = (VDraweeView) view.findViewById(u4c0.f174389o0);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(u4c0.f174248fb);
        qib0.f154691G.m102331L0(vDraweeView, "https://auto.tancdn.com/v1/raw/28687c8d-6e5d-4ab7-8f1f-1a232c3816df14.webp");
        linearLayout.removeAllViews();
        for (final FeedbackQuestion feedbackQuestion : listM31594R3) {
            VText_Medium vText_Medium = new VText_Medium(this.f155548b);
            vText_Medium.setTextSize(15.0f);
            vText_Medium.setGravity(17);
            vText_Medium.setTextColor(this.f155548b.getResources().getColor(w0c0.f183875p));
            vText_Medium.setText(feedbackQuestion.text);
            float f = t100.f167261j;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
            shapeDrawable.getPaint().setColor(Color.parseColor("#D8F5FF"));
            vText_Medium.setBackground(shapeDrawable);
            vText_Medium.setMaxHeight(t100.m186890d(72.0f));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            layoutParams.bottomMargin = t100.f167260i;
            linearLayout.addView(vText_Medium, layoutParams);
            xdl0.m208329E0(vText_Medium, new View.OnClickListener() { // from class: l.oob0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f144867a.m175726j(feedbackQuestion, view3);
                }
            });
        }
        linearLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19545a(linearLayout));
        zvf0.m220402x("e_swipe_noverify_inquiry", this.f155548b.pageId());
        CoreModule.f17545c.f19552B0.m31619r4("card");
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return false;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m175726j(FeedbackQuestion feedbackQuestion, View view) {
        this.f155547a.f21678C.m37125A2().mo38801A(SwipeDirection.RIGHT);
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        if (partialListOptM221515e != null && partialListOptM221515e.loaded.size() == 1) {
            e51.m114742G(new Runnable() { // from class: l.pob0
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19663m0.m31127m8();
                }
            });
        }
        Uri uri = Uri.parse(feedbackQuestion.data);
        List<String> queryParameters = uri.getQueryParameters("stat_id");
        zvf0.m220399u("e_swipe_noverify_inquiry", this.f155548b.pageId(), vwb.m200311Y("inquiry_source", vwb.m200296J(queryParameters) ? "" : queryParameters.get(0)));
        lva.m151843D(this.f155548b, uri);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(VSwipeCard vSwipeCard) {
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(View view) {
    }
}

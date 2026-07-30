package p003l;

import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.FeedbackQuestion;
import com.p000p1.mobile.putong.core.data.PartialListOpt;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.core.ui.VText_Medium;
import java.util.List;
import l.e51;
import l.f6c0;
import l.j760;
import l.lva;
import l.qib0;
import l.t100;
import l.u4c0;
import l.vwb;
import l.w0c0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qob0 implements ool0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f7057a;

    /* JADX INFO: renamed from: b */
    public Act f7058b;

    /* JADX INFO: renamed from: l.qob0$a */
    public class ViewOnLayoutChangeListenerC3411a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LinearLayout f7059a;

        public ViewOnLayoutChangeListenerC3411a(LinearLayout linearLayout) {
            this.f7059a = linearLayout;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i4 - i2 > t100.d(400.0f)) {
                for (int i9 = 0; i9 < this.f7059a.getChildCount(); i9++) {
                    View childAt = this.f7059a.getChildAt(i9);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    layoutParams.height = t100.d(72.0f);
                    layoutParams.weight = 0.0f;
                    childAt.setLayoutParams(layoutParams);
                }
            } else {
                for (int i10 = 0; i10 < this.f7059a.getChildCount(); i10++) {
                    View childAt2 = this.f7059a.getChildAt(i10);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                    layoutParams2.height = 0;
                    layoutParams2.weight = 1.0f;
                    childAt2.setLayoutParams(layoutParams2);
                }
            }
            this.f7059a.removeOnLayoutChangeListener(this);
        }
    }

    public qob0(NewNewHomeFrag newNewHomeFrag) {
        this.f7057a = newNewHomeFrag;
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: d */
    public View mo5288d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(f6c0.fb, viewGroup, false);
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: e */
    public void mo5289e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        this.f7058b = xdl0.E(view);
        List<FeedbackQuestion> listR3 = CoreModule.c.B0.R3();
        VDraweeView vDraweeViewFindViewById = view.findViewById(u4c0.o0);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(u4c0.fb);
        qib0.G.L0(vDraweeViewFindViewById, "https://auto.tancdn.com/v1/raw/28687c8d-6e5d-4ab7-8f1f-1a232c3816df14.webp");
        linearLayout.removeAllViews();
        for (final FeedbackQuestion feedbackQuestion : listR3) {
            VText_Medium vText_Medium = new VText_Medium(this.f7058b);
            vText_Medium.setTextSize(15.0f);
            vText_Medium.setGravity(17);
            vText_Medium.setTextColor(this.f7058b.getResources().getColor(w0c0.p));
            vText_Medium.setText(feedbackQuestion.text);
            float f = t100.j;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
            shapeDrawable.getPaint().setColor(Color.parseColor("#D8F5FF"));
            vText_Medium.setBackground(shapeDrawable);
            vText_Medium.setMaxHeight(t100.d(72.0f));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            layoutParams.bottomMargin = t100.i;
            linearLayout.addView((View) vText_Medium, (ViewGroup.LayoutParams) layoutParams);
            xdl0.E0(vText_Medium, new View.OnClickListener() { // from class: l.oob0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f6699a.m9029j(feedbackQuestion, view3);
                }
            });
        }
        linearLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC3411a(linearLayout));
        zvf0.x("e_swipe_noverify_inquiry", this.f7058b.pageId());
        CoreModule.c.B0.r4("card");
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo5290f() {
        return false;
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo5291g(SwipeDirection swipeDirection, t7m t7mVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m9029j(FeedbackQuestion feedbackQuestion, View view) {
        this.f7057a.C.A2().A(SwipeDirection.RIGHT);
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e();
        if (partialListOpt != null && partialListOpt.loaded.size() == 1) {
            e51.G(new Runnable() { // from class: l.pob0
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.m0.m8();
                }
            });
        }
        Uri uri = Uri.parse(feedbackQuestion.data);
        List<String> queryParameters = uri.getQueryParameters("stat_id");
        zvf0.u("e_swipe_noverify_inquiry", this.f7058b.pageId(), new j760[]{vwb.Y("inquiry_source", vwb.J(queryParameters) ? "" : queryParameters.get(0))});
        lva.D(this.f7058b, uri);
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: b */
    public void mo5286b(VSwipeCard vSwipeCard) {
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: c */
    public void mo5287c(View view) {
    }
}

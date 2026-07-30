package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class z7h extends w2h implements View.OnClickListener {

    /* JADX INFO: renamed from: d */
    public int f202007d;

    /* JADX INFO: renamed from: e */
    public int f202008e;

    /* JADX INFO: renamed from: f */
    public String f202009f;

    /* JADX INFO: renamed from: g */
    public q860<Moment> f202010g;

    /* JADX INFO: renamed from: h */
    public View f202011h;

    /* JADX INFO: renamed from: i */
    public d30 f202012i;

    /* JADX INFO: renamed from: j */
    public int f202013j;

    /* JADX INFO: renamed from: k */
    public int f202014k;

    /* JADX INFO: renamed from: l */
    public int f202015l;

    public z7h(int i) {
        this.f202007d = 6;
        this.f202008e = 0;
        this.f202013j = t100.m186890d(68.0f);
        this.f202014k = t100.m186890d(16.0f);
        this.f202015l = t100.m186890d(8.0f);
        this.f202007d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.w2h
    /* JADX INFO: renamed from: a */
    public boolean mo201114a(Act act, Map map, View... viewArr) {
        super.mo201114a(act, map, viewArr);
        Object obj = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_DATA_MOMENT");
        Object obj2 = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_DATA_USER_ID");
        Object obj3 = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_DATA_CLICK");
        Object obj4 = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_MOMENT_VIEW_PROCESS");
        Object obj5 = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_MOMENT_VIEW_PADDING");
        Object obj6 = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_MOMENT_VIEW_WIDTH");
        Object obj7 = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_MOMENT_VIEW_COUNT");
        Object obj8 = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_MOMENT_VIEW_GRAVITY");
        Object obj9 = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_MOMENT_VIEW_RENDERED");
        if (obj instanceof q860) {
            q860<Moment> q860Var = (q860) obj;
            List<Moment> list = q860Var.f153135a;
            if (list instanceof w700) {
                this.f202010g = new q860<>(((w700) list).m202002c(), q860Var.f153136b);
            } else {
                this.f202010g = q860Var;
            }
        }
        if (obj2 instanceof String) {
            this.f202009f = (String) obj2;
        }
        if (obj3 instanceof d30) {
            this.f202012i = (d30) obj3;
        }
        if (obj5 instanceof j760) {
            j760 j760Var = (j760) obj5;
            this.f202014k = ((Integer) j760Var.f116564a).intValue();
            this.f202015l = ((Integer) j760Var.f116565b).intValue();
        }
        boolean z = obj6 instanceof Integer;
        if (z) {
            this.f202013j = ((Integer) obj6).intValue();
        }
        if (obj7 instanceof Integer) {
            this.f202007d = ((Integer) obj7).intValue();
        }
        f30 f30Var = obj4 instanceof f30 ? (f30) obj4 : null;
        e30 e30Var = obj9 instanceof e30 ? (e30) obj9 : null;
        if (NullChecker.m81304b(viewArr) && viewArr.length > 0) {
            this.f202011h = viewArr[0];
        }
        mo95345c();
        if (!(this.f202011h instanceof RelativeLayout) || !NullChecker.m81304b(act)) {
            return false;
        }
        boolean z2 = obj8 instanceof Integer;
        View view = this.f202011h;
        LinearLayout linearLayoutM217468f = z2 ? m217468f(act, (RelativeLayout) view, ((Integer) obj8).intValue()) : m217469g(act, (RelativeLayout) view);
        m217471i(linearLayoutM217468f);
        if (NullChecker.m81303a(this.f202010g) && NullChecker.m81304b(this.f202010g.f153135a)) {
            for (Moment moment : m217467e()) {
                if (moment instanceof Moment) {
                    Moment moment2 = moment;
                    if (this.f202008e == this.f202007d) {
                        break;
                    }
                    if (NullChecker.m81304b(moment2.media)) {
                        for (Media media : moment2.media) {
                            if (this.f202008e == this.f202007d) {
                                break;
                            }
                            VDraweeView vDraweeViewM217472j = m217472j(act);
                            if (NullChecker.m81303a(f30Var)) {
                                f30Var.call(vDraweeViewM217472j, media);
                            }
                            if (media instanceof Picture) {
                                if (z) {
                                    Integer num = (Integer) obj6;
                                    qib0.f154691G.m102325I0(vDraweeViewM217472j, media.cover().profileSize(num.intValue()).formatted(), num.intValue(), num.intValue());
                                } else {
                                    qib0.f154691G.m102341Q0(vDraweeViewM217472j, ((Picture) media).momentPictureSmall());
                                }
                            } else if (media instanceof Video) {
                                Video video = (Video) media;
                                if (NullChecker.m81304b(video.cover) && NullChecker.m81304b(video.cover.url)) {
                                    qib0.f154691G.m102341Q0(vDraweeViewM217472j, video.cover.momentPictureSmall());
                                    vDraweeViewM217472j.getHierarchy().mo112056c(new vsd0(act.getResources().getDrawable(f3c0.f94530h1), ftd0.f99183g));
                                }
                            }
                            linearLayoutM217468f.addView(vDraweeViewM217472j);
                            m217473k(vDraweeViewM217472j, this.f202008e);
                            this.f202008e++;
                        }
                    }
                }
            }
            if (FeedModule.m60222H().mo30676Br() && this.f202008e == 0) {
                Iterator<Moment> it = this.f202010g.f153135a.iterator();
                while (it.hasNext()) {
                    String str = it.next().value;
                    String strReplaceAll = str != null ? str.replaceAll("\r|\n", "") : "";
                    if (!TextUtils.isEmpty(strReplaceAll)) {
                        View viewM217470h = m217470h(strReplaceAll, this.f202008e);
                        linearLayoutM217468f.addView(viewM217470h);
                        m217473k(viewM217470h, this.f202008e);
                        this.f202008e++;
                    }
                    if (this.f202008e == 3) {
                        break;
                    }
                }
            }
        }
        if (e30Var != null) {
            e30Var.call(Integer.valueOf(this.f202008e));
        }
        m217465b();
        if (this.f202008e != 0) {
            this.f202011h.setVisibility(0);
            m217466d();
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m217465b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo95345c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m217466d() {
        p6j0.m167671e("e_moment", OMSDialogPositon.p_suggest_user_profile_info_view, j760.m140076a("owner_id", this.f202009f));
    }

    /* JADX INFO: renamed from: e */
    public final List<Moment> m217467e() {
        ArrayList arrayList;
        if (this.f202010g.f153135a instanceof ArrayList) {
            arrayList = new ArrayList(this.f202010g.f153135a);
        } else {
            try {
                arrayList = new ArrayList(this.f202010g.f153135a);
            } catch (Throwable th) {
                ArrayList arrayList2 = new ArrayList();
                CrashHelper.m81296c(th);
                arrayList = arrayList2;
            }
            this.f202010g = new q860<>(arrayList, this.f202010g.f153136b);
        }
        int i = 0;
        while (i < arrayList.size()) {
            Moment moment = arrayList.get(i);
            if (vqg.m199530X(moment)) {
                arrayList.remove(moment);
                i--;
            }
            i++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final LinearLayout m217468f(Act act, RelativeLayout relativeLayout, int i) {
        LinearLayout linearLayout = new LinearLayout(act);
        linearLayout.setGravity(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        relativeLayout.removeAllViews();
        relativeLayout.addView(linearLayout, layoutParams);
        return linearLayout;
    }

    /* JADX INFO: renamed from: g */
    public final LinearLayout m217469g(Act act, RelativeLayout relativeLayout) {
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(act);
        horizontalScrollView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(act);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        linearLayout.setPadding(0, 0, 0, t100.m186890d(26.0f));
        linearLayout.setLayoutParams(marginLayoutParams);
        horizontalScrollView.addView(linearLayout);
        relativeLayout.removeAllViews();
        relativeLayout.addView(horizontalScrollView);
        return linearLayout;
    }

    /* JADX INFO: renamed from: h */
    public final View m217470h(@NonNull String str, int i) {
        VFrame vFrame = (VFrame) o7r.m163037a(this.f184243c).inflate(o6c0.f142093Q0, (ViewGroup) null);
        VImage vImage = (VImage) vFrame.findViewById(b5c0.f73589m0);
        ((VText) vFrame.findViewById(b5c0.f73513Q1)).setText(str);
        if (i == 0) {
            vImage.setImageResource(f3c0.f94578n1);
            vFrame.setBackgroundResource(f3c0.f94554k1);
            return vFrame;
        }
        if (i == 1) {
            vImage.setImageResource(f3c0.f94586o1);
            vFrame.setBackgroundResource(f3c0.f94562l1);
            return vFrame;
        }
        vImage.setImageResource(f3c0.f94594p1);
        vFrame.setBackgroundResource(f3c0.f94570m1);
        return vFrame;
    }

    /* JADX INFO: renamed from: i */
    public final void m217471i(LinearLayout linearLayout) {
        linearLayout.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: j */
    public final VDraweeView m217472j(Act act) {
        VDraweeView vDraweeView = new VDraweeView(act);
        int i = this.f202013j;
        vDraweeView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        return vDraweeView;
    }

    /* JADX INFO: renamed from: k */
    public final void m217473k(View view, int i) {
        if (NullChecker.m81304b(view)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            if (NullChecker.m81304b(layoutParams)) {
                if (i == 0) {
                    layoutParams.leftMargin = this.f202014k;
                }
                layoutParams.rightMargin = this.f202015l;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (NullChecker.m81303a(this.f202012i)) {
            this.f202012i.call();
        }
    }

    public z7h() {
        this.f202007d = 6;
        this.f202008e = 0;
        this.f202013j = t100.m186890d(68.0f);
        this.f202014k = t100.m186890d(16.0f);
        this.f202015l = t100.m186890d(8.0f);
    }
}

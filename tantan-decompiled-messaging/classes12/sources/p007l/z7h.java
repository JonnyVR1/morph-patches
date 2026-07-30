package p007l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.d30;
import l.e30;
import l.f30;
import l.ftd0;
import l.j760;
import l.o7r;
import l.q860;
import l.qib0;
import l.t100;
import l.vsd0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class z7h extends w2h implements View.OnClickListener {

    /* JADX INFO: renamed from: d */
    public int f15612d;

    /* JADX INFO: renamed from: e */
    public int f15613e;

    /* JADX INFO: renamed from: f */
    public String f15614f;

    /* JADX INFO: renamed from: g */
    public q860<Moment> f15615g;

    /* JADX INFO: renamed from: h */
    public View f15616h;

    /* JADX INFO: renamed from: i */
    public d30 f15617i;

    /* JADX INFO: renamed from: j */
    public int f15618j;

    /* JADX INFO: renamed from: k */
    public int f15619k;

    /* JADX INFO: renamed from: l */
    public int f15620l;

    public z7h(int i) {
        this.f15612d = 6;
        this.f15613e = 0;
        this.f15618j = t100.d(68.0f);
        this.f15619k = t100.d(16.0f);
        this.f15620l = t100.d(8.0f);
        this.f15612d = i;
    }

    @Override // p007l.w2h
    /* JADX INFO: renamed from: a */
    public boolean mo15680a(Act act, Map map, View... viewArr) {
        super.mo15680a(act, map, viewArr);
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
            List list = q860Var.a;
            if (list instanceof w700) {
                this.f15615g = new q860<>(((w700) list).m15709c(), q860Var.b);
            } else {
                this.f15615g = q860Var;
            }
        }
        if (obj2 instanceof String) {
            this.f15614f = (String) obj2;
        }
        if (obj3 instanceof d30) {
            this.f15617i = (d30) obj3;
        }
        if (obj5 instanceof j760) {
            j760 j760Var = (j760) obj5;
            this.f15619k = ((Integer) j760Var.a).intValue();
            this.f15620l = ((Integer) j760Var.b).intValue();
        }
        boolean z = obj6 instanceof Integer;
        if (z) {
            this.f15618j = ((Integer) obj6).intValue();
        }
        if (obj7 instanceof Integer) {
            this.f15612d = ((Integer) obj7).intValue();
        }
        f30 f30Var = obj4 instanceof f30 ? (f30) obj4 : null;
        e30 e30Var = obj9 instanceof e30 ? (e30) obj9 : null;
        if (NullChecker.b(viewArr) && viewArr.length > 0) {
            this.f15616h = viewArr[0];
        }
        mo8458c();
        if (!(this.f15616h instanceof RelativeLayout) || !NullChecker.b(act)) {
            return false;
        }
        boolean z2 = obj8 instanceof Integer;
        View view = this.f15616h;
        LinearLayout linearLayoutM17248f = z2 ? m17248f(act, (RelativeLayout) view, ((Integer) obj8).intValue()) : m17249g(act, (RelativeLayout) view);
        m17251i(linearLayoutM17248f);
        if (NullChecker.a(this.f15615g) && NullChecker.b(this.f15615g.a)) {
            for (Moment moment : m17247e()) {
                if (moment instanceof Moment) {
                    Moment moment2 = moment;
                    if (this.f15613e == this.f15612d) {
                        break;
                    }
                    if (NullChecker.b(moment2.media)) {
                        for (Media media : moment2.media) {
                            if (this.f15613e == this.f15612d) {
                                break;
                            }
                            VDraweeView vDraweeViewM17252j = m17252j(act);
                            if (NullChecker.a(f30Var)) {
                                f30Var.call(vDraweeViewM17252j, media);
                            }
                            if (media instanceof Picture) {
                                if (z) {
                                    Integer num = (Integer) obj6;
                                    qib0.G.I0(vDraweeViewM17252j, media.cover().profileSize(num.intValue()).formatted(), num.intValue(), num.intValue());
                                } else {
                                    qib0.G.Q0(vDraweeViewM17252j, ((Picture) media).momentPictureSmall());
                                }
                            } else if (media instanceof Video) {
                                Video video = (Video) media;
                                if (NullChecker.b(video.cover) && NullChecker.b(video.cover.url)) {
                                    qib0.G.Q0(vDraweeViewM17252j, video.cover.momentPictureSmall());
                                    vDraweeViewM17252j.getHierarchy().c(new vsd0(act.getResources().getDrawable(f3c0.f7813h1), ftd0.g));
                                }
                            }
                            linearLayoutM17248f.addView(vDraweeViewM17252j);
                            m17253k(vDraweeViewM17252j, this.f15613e);
                            this.f15613e++;
                        }
                    }
                }
            }
            if (FeedModule.m1140H().Br() && this.f15613e == 0) {
                Iterator it = this.f15615g.a.iterator();
                while (it.hasNext()) {
                    String str = ((Moment) it.next()).value;
                    String strReplaceAll = str != null ? str.replaceAll("\r|\n", "") : "";
                    if (!TextUtils.isEmpty(strReplaceAll)) {
                        View viewM17250h = m17250h(strReplaceAll, this.f15613e);
                        linearLayoutM17248f.addView(viewM17250h);
                        m17253k(viewM17250h, this.f15613e);
                        this.f15613e++;
                    }
                    if (this.f15613e == 3) {
                        break;
                    }
                }
            }
        }
        if (e30Var != null) {
            e30Var.call(Integer.valueOf(this.f15613e));
        }
        m17245b();
        if (this.f15613e != 0) {
            this.f15616h.setVisibility(0);
            m17246d();
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m17245b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo8458c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m17246d() {
        p6j0.m12915e("e_moment", OMSDialogPositon.p_suggest_user_profile_info_view, j760.a("owner_id", this.f15614f));
    }

    /* JADX INFO: renamed from: e */
    public final List<Moment> m17247e() {
        ArrayList arrayList;
        if (this.f15615g.a instanceof ArrayList) {
            arrayList = new ArrayList(this.f15615g.a);
        } else {
            try {
                arrayList = new ArrayList(this.f15615g.a);
            } catch (Throwable th) {
                ArrayList arrayList2 = new ArrayList();
                CrashHelper.c(th);
                arrayList = arrayList2;
            }
            this.f15615g = new q860<>(arrayList, this.f15615g.b);
        }
        int i = 0;
        while (i < arrayList.size()) {
            Moment moment = arrayList.get(i);
            if (vqg.m15500X(moment)) {
                arrayList.remove(moment);
                i--;
            }
            i++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final LinearLayout m17248f(Act act, RelativeLayout relativeLayout, int i) {
        LinearLayout linearLayout = new LinearLayout(act);
        linearLayout.setGravity(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        relativeLayout.removeAllViews();
        relativeLayout.addView(linearLayout, layoutParams);
        return linearLayout;
    }

    /* JADX INFO: renamed from: g */
    public final LinearLayout m17249g(Act act, RelativeLayout relativeLayout) {
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(act);
        horizontalScrollView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(act);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        linearLayout.setPadding(0, 0, 0, t100.d(26.0f));
        linearLayout.setLayoutParams(marginLayoutParams);
        horizontalScrollView.addView(linearLayout);
        relativeLayout.removeAllViews();
        relativeLayout.addView(horizontalScrollView);
        return linearLayout;
    }

    /* JADX INFO: renamed from: h */
    public final View m17250h(@NonNull String str, int i) {
        VFrame vFrameInflate = o7r.a(this.f14376c).inflate(o6c0.f11112Q0, (ViewGroup) null);
        VImage vImageFindViewById = vFrameInflate.findViewById(b5c0.f6070m0);
        vFrameInflate.findViewById(b5c0.f5994Q1).setText(str);
        if (i == 0) {
            vImageFindViewById.setImageResource(f3c0.f7861n1);
            vFrameInflate.setBackgroundResource(f3c0.f7837k1);
            return vFrameInflate;
        }
        if (i == 1) {
            vImageFindViewById.setImageResource(f3c0.f7869o1);
            vFrameInflate.setBackgroundResource(f3c0.f7845l1);
            return vFrameInflate;
        }
        vImageFindViewById.setImageResource(f3c0.f7877p1);
        vFrameInflate.setBackgroundResource(f3c0.f7853m1);
        return vFrameInflate;
    }

    /* JADX INFO: renamed from: i */
    public final void m17251i(LinearLayout linearLayout) {
        linearLayout.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: j */
    public final VDraweeView m17252j(Act act) {
        VDraweeView vDraweeView = new VDraweeView(act);
        int i = this.f15618j;
        vDraweeView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        return vDraweeView;
    }

    /* JADX INFO: renamed from: k */
    public final void m17253k(View view, int i) {
        if (NullChecker.b(view)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            if (NullChecker.b(layoutParams)) {
                if (i == 0) {
                    layoutParams.leftMargin = this.f15619k;
                }
                layoutParams.rightMargin = this.f15620l;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (NullChecker.a(this.f15617i)) {
            this.f15617i.call();
        }
    }

    public z7h() {
        this.f15612d = 6;
        this.f15613e = 0;
        this.f15618j = t100.d(68.0f);
        this.f15619k = t100.d(16.0f);
        this.f15620l = t100.d(8.0f);
    }
}

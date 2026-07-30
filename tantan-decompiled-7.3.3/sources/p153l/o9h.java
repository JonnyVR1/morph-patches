package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class o9h extends l4h implements View.OnClickListener {

    /* JADX INFO: renamed from: d */
    public int f145569d;

    /* JADX INFO: renamed from: e */
    public int f145570e;

    /* JADX INFO: renamed from: f */
    public String f145571f;

    /* JADX INFO: renamed from: g */
    public vg60<Moment> f145572g;

    /* JADX INFO: renamed from: h */
    public View f145573h;

    /* JADX INFO: renamed from: i */
    public x20 f145574i;

    /* JADX INFO: renamed from: j */
    public int f145575j;

    /* JADX INFO: renamed from: k */
    public int f145576k;

    /* JADX INFO: renamed from: l */
    public int f145577l;

    public o9h(int i) {
        this.f145569d = 6;
        this.f145570e = 0;
        this.f145575j = qa00.m175859d(68.0f);
        this.f145576k = qa00.m175859d(16.0f);
        this.f145577l = qa00.m175859d(8.0f);
        this.f145569d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l4h
    /* JADX INFO: renamed from: a */
    public boolean mo152787a(Act act, Map map, View... viewArr) {
        super.mo152787a(act, map, viewArr);
        Object obj = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_DATA_MOMENT");
        Object obj2 = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_DATA_USER_ID");
        Object obj3 = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_DATA_CLICK");
        Object obj4 = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_MOMENT_VIEW_PROCESS");
        Object obj5 = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_MOMENT_VIEW_PADDING");
        Object obj6 = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_MOMENT_VIEW_WIDTH");
        Object obj7 = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_MOMENT_VIEW_COUNT");
        Object obj8 = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_MOMENT_VIEW_GRAVITY");
        Object obj9 = map.get("FEED_INSERT_PART_ATTENTION_BUTTON_MOMENT_VIEW_RENDERED");
        if (obj instanceof vg60) {
            vg60<Moment> vg60Var = (vg60) obj;
            List<Moment> list = vg60Var.f184001a;
            if (list instanceof fg00) {
                this.f145572g = new vg60<>(((fg00) list).m125473c(), vg60Var.f184002b);
            } else {
                this.f145572g = vg60Var;
            }
        }
        if (obj2 instanceof String) {
            this.f145571f = (String) obj2;
        }
        if (obj3 instanceof x20) {
            this.f145574i = (x20) obj3;
        }
        if (obj5 instanceof pf60) {
            pf60 pf60Var = (pf60) obj5;
            this.f145576k = ((Integer) pf60Var.f152156a).intValue();
            this.f145577l = ((Integer) pf60Var.f152157b).intValue();
        }
        boolean z = obj6 instanceof Integer;
        if (z) {
            this.f145575j = ((Integer) obj6).intValue();
        }
        if (obj7 instanceof Integer) {
            this.f145569d = ((Integer) obj7).intValue();
        }
        z20 z20Var = obj4 instanceof z20 ? (z20) obj4 : null;
        y20 y20Var = obj9 instanceof y20 ? (y20) obj9 : null;
        if (NullChecker.m82487b(viewArr) && viewArr.length > 0) {
            this.f145573h = viewArr[0];
        }
        mo166720c();
        if (!(this.f145573h instanceof RelativeLayout) || !NullChecker.m82487b(act)) {
            return false;
        }
        boolean z2 = obj8 instanceof Integer;
        View view = this.f145573h;
        LinearLayout linearLayoutM166723f = z2 ? m166723f(act, (RelativeLayout) view, ((Integer) obj8).intValue()) : m166724g(act, (RelativeLayout) view);
        m166726i(linearLayoutM166723f);
        if (NullChecker.m82486a(this.f145572g) && NullChecker.m82487b(this.f145572g.f184001a)) {
            for (Moment moment : m166722e()) {
                if (moment instanceof Moment) {
                    Moment moment2 = moment;
                    if (this.f145570e == this.f145569d) {
                        break;
                    }
                    if (NullChecker.m82487b(moment2.media)) {
                        for (Media media : moment2.media) {
                            if (this.f145570e == this.f145569d) {
                                break;
                            }
                            VDraweeView vDraweeViewM166727j = m166727j(act);
                            if (NullChecker.m82486a(z20Var)) {
                                z20Var.call(vDraweeViewM166727j, media);
                            }
                            if (media instanceof Picture) {
                                if (z) {
                                    Integer num = (Integer) obj6;
                                    uqb0.f180374G.m127109I0(vDraweeViewM166727j, media.cover().profileSize(num.intValue()).formatted(), num.intValue(), num.intValue());
                                } else {
                                    uqb0.f180374G.m127125Q0(vDraweeViewM166727j, ((Picture) media).momentPictureSmall());
                                }
                            } else if (media instanceof Video) {
                                Video video = (Video) media;
                                if (NullChecker.m82487b(video.cover) && NullChecker.m82487b(video.cover.url)) {
                                    uqb0.f180374G.m127125Q0(vDraweeViewM166727j, video.cover.momentPictureSmall());
                                    vDraweeViewM166727j.getHierarchy().mo118277c(new x0e0(act.getResources().getDrawable(lbc0.f131048h1), h1e0.f107450g));
                                }
                            }
                            linearLayoutM166723f.addView(vDraweeViewM166727j);
                            m166728k(vDraweeViewM166727j, this.f145570e);
                            this.f145570e++;
                        }
                    }
                }
            }
            if (FeedModule.m61406H().mo31679Br() && this.f145570e == 0) {
                Iterator<Moment> it = this.f145572g.f184001a.iterator();
                while (it.hasNext()) {
                    String str = it.next().value;
                    String strReplaceAll = str != null ? str.replaceAll("\r|\n", "") : "";
                    if (!TextUtils.isEmpty(strReplaceAll)) {
                        View viewM166725h = m166725h(strReplaceAll, this.f145570e);
                        linearLayoutM166723f.addView(viewM166725h);
                        m166728k(viewM166725h, this.f145570e);
                        this.f145570e++;
                    }
                    if (this.f145570e == 3) {
                        break;
                    }
                }
            }
        }
        if (y20Var != null) {
            y20Var.call(Integer.valueOf(this.f145570e));
        }
        m166719b();
        if (this.f145570e != 0) {
            this.f145573h.setVisibility(0);
            m166721d();
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m166719b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo166720c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m166721d() {
        tfj0.m190942e("e_moment", OMSDialogPositon.p_suggest_user_profile_info_view, pf60.m172085a("owner_id", this.f145571f));
    }

    /* JADX INFO: renamed from: e */
    public final List<Moment> m166722e() {
        ArrayList arrayList;
        if (this.f145572g.f184001a instanceof ArrayList) {
            arrayList = new ArrayList(this.f145572g.f184001a);
        } else {
            try {
                arrayList = new ArrayList(this.f145572g.f184001a);
            } catch (Throwable th) {
                ArrayList arrayList2 = new ArrayList();
                CrashHelper.m82479c(th);
                arrayList = arrayList2;
            }
            this.f145572g = new vg60<>(arrayList, this.f145572g.f184002b);
        }
        int i = 0;
        while (i < arrayList.size()) {
            Moment moment = arrayList.get(i);
            if (ksg.m151189X(moment)) {
                arrayList.remove(moment);
                i--;
            }
            i++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final LinearLayout m166723f(Act act, RelativeLayout relativeLayout, int i) {
        LinearLayout linearLayout = new LinearLayout(act);
        linearLayout.setGravity(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        relativeLayout.removeAllViews();
        relativeLayout.addView(linearLayout, layoutParams);
        return linearLayout;
    }

    /* JADX INFO: renamed from: g */
    public final LinearLayout m166724g(Act act, RelativeLayout relativeLayout) {
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(act);
        horizontalScrollView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(act);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        linearLayout.setPadding(0, 0, 0, qa00.m175859d(26.0f));
        linearLayout.setLayoutParams(marginLayoutParams);
        horizontalScrollView.addView(linearLayout);
        relativeLayout.removeAllViews();
        relativeLayout.addView(horizontalScrollView);
        return linearLayout;
    }

    /* JADX INFO: renamed from: h */
    public final View m166725h(@NonNull String str, int i) {
        VFrame vFrame = (VFrame) p9r.m171370a(this.f129982c).inflate(tec0.f173562Q0, (ViewGroup) null);
        VImage vImage = (VImage) vFrame.findViewById(hdc0.f108942m0);
        ((VText) vFrame.findViewById(hdc0.f108866Q1)).setText(str);
        if (i == 0) {
            vImage.setImageResource(lbc0.f131096n1);
            vFrame.setBackgroundResource(lbc0.f131072k1);
            return vFrame;
        }
        if (i == 1) {
            vImage.setImageResource(lbc0.f131104o1);
            vFrame.setBackgroundResource(lbc0.f131080l1);
            return vFrame;
        }
        vImage.setImageResource(lbc0.f131112p1);
        vFrame.setBackgroundResource(lbc0.f131088m1);
        return vFrame;
    }

    /* JADX INFO: renamed from: i */
    public final void m166726i(LinearLayout linearLayout) {
        linearLayout.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: j */
    public final VDraweeView m166727j(Act act) {
        VDraweeView vDraweeView = new VDraweeView(act);
        int i = this.f145575j;
        vDraweeView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        return vDraweeView;
    }

    /* JADX INFO: renamed from: k */
    public final void m166728k(View view, int i) {
        if (NullChecker.m82487b(view)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            if (NullChecker.m82487b(layoutParams)) {
                if (i == 0) {
                    layoutParams.leftMargin = this.f145576k;
                }
                layoutParams.rightMargin = this.f145577l;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (NullChecker.m82486a(this.f145574i)) {
            this.f145574i.call();
        }
    }

    public o9h() {
        this.f145569d = 6;
        this.f145570e = 0;
        this.f145575j = qa00.m175859d(68.0f);
        this.f145576k = qa00.m175859d(16.0f);
        this.f145577l = qa00.m175859d(8.0f);
    }
}

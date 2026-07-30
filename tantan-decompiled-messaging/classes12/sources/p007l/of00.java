package p007l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedMomentForwardSheetItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.mkd0;
import l.qhy;
import l.t100;
import v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class of00 {

    /* JADX INFO: renamed from: d */
    public static String f11454d = "转发设置";

    /* JADX INFO: renamed from: e */
    public static volatile of00 f11455e;

    /* JADX INFO: renamed from: a */
    public C2450a f11456a;

    /* JADX INFO: renamed from: b */
    public String[] f11457b = {"允许他人转发", "禁止他人转发"};

    /* JADX INFO: renamed from: c */
    public String[] f11458c = {MomentAllowForwardState.allow, MomentAllowForwardState.disallow};

    /* JADX INFO: renamed from: l.of00$a */
    public static class C2450a extends dac0<VListCell.a> {

        /* JADX INFO: renamed from: c */
        public List<VListCell.a> f11459c;

        /* JADX INFO: renamed from: d */
        public Act f11460d;

        /* JADX INFO: renamed from: e */
        public int f11461e;

        /* JADX INFO: renamed from: f */
        public Moment f11462f;

        public C2450a(List<VListCell.a> list, Act act, int i, Moment moment) {
            this.f11459c = list;
            this.f11460d = act;
            this.f11461e = i;
            this.f11462f = moment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m12627I(int i, View view) {
            this.f11461e = i;
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: C */
        public int m12629C() {
            return this.f11459c.size();
        }

        /* JADX INFO: renamed from: D */
        public View m12630D(ViewGroup viewGroup, int i) {
            return this.f11460d.inflater().inflate(o6c0.f11299s1, viewGroup, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void m12628A(View view, VListCell.a aVar, int i, final int i2) {
            FeedMomentForwardSheetItemView feedMomentForwardSheetItemView = (FeedMomentForwardSheetItemView) view;
            feedMomentForwardSheetItemView.m6254q(aVar, i2 == this.f11461e, false);
            feedMomentForwardSheetItemView.setOnClickListener(new View.OnClickListener() { // from class: l.nf00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f10763a.m12627I(i2, view2);
                }
            });
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public VListCell.a getItem(int i) {
            if (i >= this.f11459c.size()) {
                return null;
            }
            return this.f11459c.get(i);
        }

        public int getItemCount() {
            List<VListCell.a> list = this.f11459c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* JADX INFO: renamed from: f */
    public static of00 m12618f() {
        if (f11455e == null) {
            synchronized (of00.class) {
                try {
                    if (f11455e == null) {
                        f11455e = new of00();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11455e;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m12619i(Moment moment) {
        return moment != null && TextUtils.equals(el00.m9903k().m9912p(moment), "everyone") && vqg.m15518h0(moment);
    }

    /* JADX INFO: renamed from: e */
    public int m12620e(Moment moment) {
        return (NullChecker.a(moment) && TextUtils.equals(moment.allowForward.toString(), MomentAllowForwardState.disallow)) ? 1 : 0;
    }

    /* JADX INFO: renamed from: g */
    public final List<VListCell.a> m12621g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f11457b) {
            arrayList.add(new VListCell.a(str, (CharSequence) null, (CharSequence) null, -1, -1, o6c0.f11299s1));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public String m12622h(int i) {
        if (i < 0) {
            return "";
        }
        String[] strArr = this.f11458c;
        return i < strArr.length ? strArr[i] : "";
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m12623j(Moment moment, final qhy[] qhyVarArr, Act act, View view) {
        String strM12622h = m12622h(this.f11456a.f11461e);
        if (!NullChecker.a(moment) || TextUtils.isEmpty(strM12622h)) {
            qhyVarArr[0].b();
        } else if (TEnum.equals(moment.allowForward, strM12622h)) {
            qhyVarArr[0].b();
        } else {
            act.duringCreated(FeedModule.f316d.m16767xd(FeedModule.m1139F().userId(), ((DbObject) moment).id, strM12622h)).subscribe(mkd0.H(new e30() { // from class: l.lf00
                public final void call(Object obj) {
                    qhyVarArr[0].b();
                }
            }, new e30() { // from class: l.mf00
                public final void call(Object obj) {
                    qhyVarArr[0].b();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m12624k(final Act act, final Moment moment) {
        final qhy[] qhyVarArr = {null};
        this.f11456a = new C2450a(m12621g(), act, m12620e(moment), moment);
        qhy.a aVar = new qhy.a(act);
        aVar.f0(f11454d).X(f3c0.f7843l).W(new View.OnClickListener() { // from class: l.jf00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qhyVarArr[0].b();
            }
        }).Z(R$string.f534i).b0(act.getResources().getColor(e1c0.f7154n)).d0(17.0f).c0(t100.d(20.0f)).Y(new View.OnClickListener() { // from class: l.kf00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9694a.m12623j(moment, qhyVarArr, act, view);
            }
        }).h0(0).i0(0).V(new LinearLayoutManager(act)).O(this.f11456a);
        qhy qhyVarN = aVar.N();
        qhyVarArr[0] = qhyVarN;
        qhyVarN.g();
    }
}

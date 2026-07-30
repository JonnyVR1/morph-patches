package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedMomentForwardSheetItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VListCell;

/* JADX INFO: loaded from: classes12.dex */
public class of00 {

    /* JADX INFO: renamed from: d */
    public static String f143608d = "转发设置";

    /* JADX INFO: renamed from: e */
    public static volatile of00 f143609e;

    /* JADX INFO: renamed from: a */
    public C18912a f143610a;

    /* JADX INFO: renamed from: b */
    public String[] f143611b = {"允许他人转发", "禁止他人转发"};

    /* JADX INFO: renamed from: c */
    public String[] f143612c = {MomentAllowForwardState.allow, MomentAllowForwardState.disallow};

    /* JADX INFO: renamed from: l.of00$a */
    public static class C18912a extends dac0<VListCell.C22545a> {

        /* JADX INFO: renamed from: c */
        public List<VListCell.C22545a> f143613c;

        /* JADX INFO: renamed from: d */
        public Act f143614d;

        /* JADX INFO: renamed from: e */
        public int f143615e;

        /* JADX INFO: renamed from: f */
        public Moment f143616f;

        public C18912a(List<VListCell.C22545a> list, Act act, int i, Moment moment) {
            this.f143613c = list;
            this.f143614d = act;
            this.f143615e = i;
            this.f143616f = moment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m164053I(int i, View view) {
            this.f143615e = i;
            notifyDataSetChanged();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f143613c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return this.f143614d.inflater().inflate(o6c0.f142280s1, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, VListCell.C22545a c22545a, int i, final int i2) {
            FeedMomentForwardSheetItemView feedMomentForwardSheetItemView = (FeedMomentForwardSheetItemView) view;
            feedMomentForwardSheetItemView.m65153q(c22545a, i2 == this.f143615e, false);
            feedMomentForwardSheetItemView.setOnClickListener(new View.OnClickListener() { // from class: l.nf00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f138675a.m164053I(i2, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public VListCell.C22545a getItem(int i) {
            if (i >= this.f143613c.size()) {
                return null;
            }
            return this.f143613c.get(i);
        }

        @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<VListCell.C22545a> list = this.f143613c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* JADX INFO: renamed from: f */
    public static of00 m164044f() {
        if (f143609e == null) {
            synchronized (of00.class) {
                try {
                    if (f143609e == null) {
                        f143609e = new of00();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f143609e;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m164045i(Moment moment) {
        return moment != null && TextUtils.equals(el00.m117022k().m117031p(moment), "everyone") && vqg.m199548h0(moment);
    }

    /* JADX INFO: renamed from: e */
    public int m164046e(Moment moment) {
        return (NullChecker.m81303a(moment) && TextUtils.equals(moment.allowForward.toString(), MomentAllowForwardState.disallow)) ? 1 : 0;
    }

    /* JADX INFO: renamed from: g */
    public final List<VListCell.C22545a> m164047g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f143611b) {
            arrayList.add(new VListCell.C22545a(str, null, null, -1, -1, o6c0.f142280s1));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public String m164048h(int i) {
        if (i < 0) {
            return "";
        }
        String[] strArr = this.f143612c;
        return i < strArr.length ? strArr[i] : "";
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m164049j(Moment moment, final qhy[] qhyVarArr, Act act, View view) {
        String strM164048h = m164048h(this.f143610a.f143615e);
        if (!NullChecker.m81303a(moment) || TextUtils.isEmpty(strM164048h)) {
            qhyVarArr[0].m174609b();
        } else if (TEnum.equals(moment.allowForward, strM164048h)) {
            qhyVarArr[0].m174609b();
        } else {
            act.duringCreated(FeedModule.f38855d.m209586xd(FeedModule.m60221F().userId(), moment.f56011id, strM164048h)).subscribe(mkd0.m154956H(new e30() { // from class: l.lf00
                @Override // p149l.e30
                public final void call(Object obj) {
                    qhyVarArr[0].m174609b();
                }
            }, new e30() { // from class: l.mf00
                @Override // p149l.e30
                public final void call(Object obj) {
                    qhyVarArr[0].m174609b();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m164050k(final Act act, final Moment moment) {
        final qhy[] qhyVarArr = {null};
        this.f143610a = new C18912a(m164047g(), act, m164046e(moment), moment);
        qhy.C19502a c19502a = new qhy.C19502a(act);
        c19502a.m174672f0(f143608d).m174664X(f3c0.f94560l).m174663W(new View.OnClickListener() { // from class: l.jf00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qhyVarArr[0].m174609b();
            }
        }).m174666Z(R$string.f39073i).m174668b0(act.getResources().getColor(e1c0.f88798n)).m174670d0(17.0f).m174669c0(t100.m186890d(20.0f)).m174665Y(new View.OnClickListener() { // from class: l.kf00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122886a.m164049j(moment, qhyVarArr, act, view);
            }
        }).m174674h0(0).m174675i0(0).m174662V(new LinearLayoutManager(act)).m174655O(this.f143610a);
        qhy qhyVarM174654N = c19502a.m174654N();
        qhyVarArr[0] = qhyVarM174654N;
        qhyVarM174654N.m174614g();
    }
}

package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedMomentForwardSheetItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VListCell;

/* JADX INFO: loaded from: classes13.dex */
public class xn00 {

    /* JADX INFO: renamed from: d */
    public static String f195342d = "转发设置";

    /* JADX INFO: renamed from: e */
    public static volatile xn00 f195343e;

    /* JADX INFO: renamed from: a */
    public C21387a f195344a;

    /* JADX INFO: renamed from: b */
    public String[] f195345b = {"允许他人转发", "禁止他人转发"};

    /* JADX INFO: renamed from: c */
    public String[] f195346c = {MomentAllowForwardState.allow, MomentAllowForwardState.disallow};

    /* JADX INFO: renamed from: l.xn00$a */
    public static class C21387a extends jic0<VListCell.C22660a> {

        /* JADX INFO: renamed from: c */
        public List<VListCell.C22660a> f195347c;

        /* JADX INFO: renamed from: d */
        public Act f195348d;

        /* JADX INFO: renamed from: e */
        public int f195349e;

        /* JADX INFO: renamed from: f */
        public Moment f195350f;

        public C21387a(List<VListCell.C22660a> list, Act act, int i, Moment moment) {
            this.f195347c = list;
            this.f195348d = act;
            this.f195349e = i;
            this.f195350f = moment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m212089I(int i, View view) {
            this.f195349e = i;
            notifyDataSetChanged();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f195347c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return this.f195348d.inflater().inflate(tec0.f173749s1, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, VListCell.C22660a c22660a, int i, final int i2) {
            FeedMomentForwardSheetItemView feedMomentForwardSheetItemView = (FeedMomentForwardSheetItemView) view;
            feedMomentForwardSheetItemView.m66336q(c22660a, i2 == this.f195349e, false);
            feedMomentForwardSheetItemView.setOnClickListener(new View.OnClickListener() { // from class: l.wn00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f189845a.m212089I(i2, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public VListCell.C22660a getItem(int i) {
            if (i >= this.f195347c.size()) {
                return null;
            }
            return this.f195347c.get(i);
        }

        @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<VListCell.C22660a> list = this.f195347c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* JADX INFO: renamed from: f */
    public static xn00 m212080f() {
        if (f195343e == null) {
            synchronized (xn00.class) {
                try {
                    if (f195343e == null) {
                        f195343e = new xn00();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f195343e;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m212081i(Moment moment) {
        return moment != null && TextUtils.equals(nt00.m164664k().m164673p(moment), "everyone") && ksg.m151207h0(moment);
    }

    /* JADX INFO: renamed from: e */
    public int m212082e(Moment moment) {
        return (NullChecker.m82486a(moment) && TextUtils.equals(moment.allowForward.toString(), MomentAllowForwardState.disallow)) ? 1 : 0;
    }

    /* JADX INFO: renamed from: g */
    public final List<VListCell.C22660a> m212083g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f195345b) {
            arrayList.add(new VListCell.C22660a(str, null, null, -1, -1, tec0.f173749s1));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public String m212084h(int i) {
        if (i < 0) {
            return "";
        }
        String[] strArr = this.f195346c;
        return i < strArr.length ? strArr[i] : "";
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m212085j(Moment moment, final nqy[] nqyVarArr, Act act, View view) {
        String strM212084h = m212084h(this.f195344a.f195349e);
        if (!NullChecker.m82486a(moment) || TextUtils.isEmpty(strM212084h)) {
            nqyVarArr[0].m164362b();
        } else if (TEnum.equals(moment.allowForward, strM212084h)) {
            nqyVarArr[0].m164362b();
        } else {
            act.duringCreated(FeedModule.f39703d.m145827xd(FeedModule.m61405F().userId(), moment.f56859id, strM212084h)).subscribe(psd0.m173597H(new y20() { // from class: l.un00
                @Override // p153l.y20
                public final void call(Object obj) {
                    nqyVarArr[0].m164362b();
                }
            }, new y20() { // from class: l.vn00
                @Override // p153l.y20
                public final void call(Object obj) {
                    nqyVarArr[0].m164362b();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m212086k(final Act act, final Moment moment) {
        final nqy[] nqyVarArr = {null};
        this.f195344a = new C21387a(m212083g(), act, m212082e(moment), moment);
        nqy.C18929a c18929a = new nqy.C18929a(act);
        c18929a.m164425f0(f195342d).m164417X(lbc0.f131078l).m164416W(new View.OnClickListener() { // from class: l.sn00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nqyVarArr[0].m164362b();
            }
        }).m164419Z(R$string.f39921i).m164421b0(act.getResources().getColor(k9c0.f124521n)).m164423d0(17.0f).m164422c0(qa00.m175859d(20.0f)).m164418Y(new View.OnClickListener() { // from class: l.tn00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175213a.m212085j(moment, nqyVarArr, act, view);
            }
        }).m164427h0(0).m164428i0(0).m164415V(new LinearLayoutManager(act)).m164408O(this.f195344a);
        nqy nqyVarM164407N = c18929a.m164407N();
        nqyVarArr[0] = nqyVarM164407N;
        nqyVarM164407N.m164367g();
    }
}

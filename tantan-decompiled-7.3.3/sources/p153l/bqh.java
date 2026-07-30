package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.NewPostLocationAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiDialogLocationItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class bqh extends jic0<cqh> {

    /* JADX INFO: renamed from: c */
    public MessageLocation f77898c;

    /* JADX INFO: renamed from: d */
    public Act f77899d;

    /* JADX INFO: renamed from: e */
    public String f77900e;

    /* JADX INFO: renamed from: f */
    public String f77901f;

    /* JADX INFO: renamed from: g */
    public List<cqh> f77902g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public InterfaceC16082a f77903h;

    /* JADX INFO: renamed from: l.bqh$a */
    public interface InterfaceC16082a {
        /* JADX INFO: renamed from: l */
        void mo105933l(MessageLocation messageLocation);
    }

    public bqh(Act act, String str, String str2) {
        this.f77899d = act;
        this.f77900e = str;
        this.f77901f = str2;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ Boolean m105919E(g90 g90Var, cqh cqhVar) {
        MessageLocation messageLocation = cqhVar.f83086a;
        return messageLocation == null ? Boolean.FALSE : Boolean.valueOf(TextUtils.equals(messageLocation.name, g90Var.m129468c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m105922L(View view) {
        m105923P();
    }

    /* JADX INFO: renamed from: P */
    private void m105923P() {
        Act act = this.f77899d;
        act.startActivity(NewPostLocationAct.m63886X1(act, fph.f100129K));
        this.f77899d.overridePendingTransition(a8c0.f68909i, 0);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        List<cqh> list = this.f77902g;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return this.f77899d.inflater().inflate(tec0.f173694k2, viewGroup, false);
        }
        View view = new View(this.f77899d);
        view.setLayoutParams(new RecyclerView.C0580p(qa00.f156338y, qa00.f156314a));
        return view;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final cqh cqhVar, int i, int i2) {
        if (i == 2) {
            FeedPoiDialogLocationItem feedPoiDialogLocationItem = (FeedPoiDialogLocationItem) view;
            if (cqhVar.f83087b == 5) {
                feedPoiDialogLocationItem.m66195Q();
                bnl0.m105509E0(feedPoiDialogLocationItem, new View.OnClickListener() { // from class: l.zph
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f205462a.m105922L(view2);
                    }
                });
            } else {
                MessageLocation messageLocation = cqhVar.f83086a;
                feedPoiDialogLocationItem.m66196R(messageLocation.name, m105927K(messageLocation));
                bnl0.m105509E0(feedPoiDialogLocationItem, new View.OnClickListener() { // from class: l.aqh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f72815a.m105928M(cqhVar, view2);
                    }
                });
            }
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public cqh getItem(int i) {
        return this.f77902g.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m105926J(final g90 g90Var) {
        List<cqh> list;
        if (g90Var == null || (list = this.f77902g) == null || list.size() <= 1) {
            return;
        }
        cqh cqhVar = (cqh) jyb.m147529r(this.f77902g, new qcj() { // from class: l.yph
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bqh.m105919E(g90Var, (cqh) obj);
            }
        });
        if (NullChecker.m82486a(cqhVar)) {
            m105931Q(cqhVar.f83086a);
            return;
        }
        MessageLocation messageLocationM201260d = vh80.m201260d(g90Var);
        cqh cqhVar2 = new cqh(messageLocationM201260d, 4);
        int i = this.f77902g.get(1).f83087b;
        List<cqh> list2 = this.f77902g;
        if (i == 4) {
            list2.set(1, cqhVar2);
        } else {
            list2.add(1, cqhVar2);
        }
        m105931Q(messageLocationM201260d);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m105927K(MessageLocation messageLocation) {
        MessageLocation messageLocation2 = this.f77898c;
        if (messageLocation2 == null || messageLocation == null) {
            return false;
        }
        return TextUtils.equals(messageLocation2.name, messageLocation.name);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m105928M(cqh cqhVar, View view) {
        m105932R(cqhVar.f83086a, true);
    }

    /* JADX INFO: renamed from: N */
    public void m105929N(List<cqh> list, MessageLocation messageLocation) {
        this.f77902g = list;
        this.f77898c = messageLocation;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: O */
    public void m105930O(InterfaceC16082a interfaceC16082a) {
        this.f77903h = interfaceC16082a;
    }

    /* JADX INFO: renamed from: Q */
    public void m105931Q(MessageLocation messageLocation) {
        m105932R(messageLocation, false);
    }

    /* JADX INFO: renamed from: R */
    public void m105932R(MessageLocation messageLocation, boolean z) {
        if (messageLocation == null) {
            return;
        }
        MessageLocation messageLocation2 = this.f77898c;
        if (messageLocation2 == null || !TextUtils.equals(messageLocation.name, messageLocation2.name)) {
            this.f77898c = messageLocation;
            notifyDataSetChanged();
            if (NullChecker.m82486a(this.f77903h)) {
                this.f77903h.mo105933l(this.f77898c);
            }
            if (z) {
                i4g0.m138520r("e_poi_tag", this.f77900e);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return getItem(i).f83087b == 1 ? 1 : 2;
    }
}

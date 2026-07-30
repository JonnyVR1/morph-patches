package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.NewPostLocationAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiDialogLocationItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class moh extends dac0<noh> {

    /* JADX INFO: renamed from: c */
    public MessageLocation f134905c;

    /* JADX INFO: renamed from: d */
    public Act f134906d;

    /* JADX INFO: renamed from: e */
    public String f134907e;

    /* JADX INFO: renamed from: f */
    public String f134908f;

    /* JADX INFO: renamed from: g */
    public List<noh> f134909g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public InterfaceC18519a f134910h;

    /* JADX INFO: renamed from: l.moh$a */
    public interface InterfaceC18519a {
        /* JADX INFO: renamed from: l */
        void mo122864l(MessageLocation messageLocation);
    }

    public moh(Act act, String str, String str2) {
        this.f134906d = act;
        this.f134907e = str;
        this.f134908f = str2;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ Boolean m155690E(k90 k90Var, noh nohVar) {
        MessageLocation messageLocation = nohVar.f139845a;
        return messageLocation == null ? Boolean.FALSE : Boolean.valueOf(TextUtils.equals(messageLocation.name, k90Var.m144984c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m155693L(View view) {
        m155694P();
    }

    /* JADX INFO: renamed from: P */
    private void m155694P() {
        Act act = this.f134906d;
        act.startActivity(NewPostLocationAct.m62703V1(act, qnh.f155438K));
        this.f134906d.overridePendingTransition(uzb0.f178984i, 0);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        List<noh> list = this.f134909g;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return this.f134906d.inflater().inflate(o6c0.f142225k2, viewGroup, false);
        }
        View view = new View(this.f134906d);
        view.setLayoutParams(new RecyclerView.C0578p(t100.f167276y, t100.f167252a));
        return view;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final noh nohVar, int i, int i2) {
        if (i == 2) {
            FeedPoiDialogLocationItem feedPoiDialogLocationItem = (FeedPoiDialogLocationItem) view;
            if (nohVar.f139846b == 5) {
                feedPoiDialogLocationItem.m65012Q();
                xdl0.m208329E0(feedPoiDialogLocationItem, new View.OnClickListener() { // from class: l.koh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f124015a.m155693L(view2);
                    }
                });
            } else {
                MessageLocation messageLocation = nohVar.f139845a;
                feedPoiDialogLocationItem.m65013R(messageLocation.name, m155698K(messageLocation));
                xdl0.m208329E0(feedPoiDialogLocationItem, new View.OnClickListener() { // from class: l.loh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f129105a.m155699M(nohVar, view2);
                    }
                });
            }
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public noh getItem(int i) {
        return this.f134909g.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m155697J(final k90 k90Var) {
        List<noh> list;
        if (k90Var == null || (list = this.f134909g) == null || list.size() <= 1) {
            return;
        }
        noh nohVar = (noh) vwb.m200346r(this.f134909g, new w9j() { // from class: l.joh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return moh.m155690E(k90Var, (noh) obj);
            }
        });
        if (NullChecker.m81303a(nohVar)) {
            m155702Q(nohVar.f139845a);
            return;
        }
        MessageLocation messageLocationM167861d = p980.m167861d(k90Var);
        noh nohVar2 = new noh(messageLocationM167861d, 4);
        int i = this.f134909g.get(1).f139846b;
        List<noh> list2 = this.f134909g;
        if (i == 4) {
            list2.set(1, nohVar2);
        } else {
            list2.add(1, nohVar2);
        }
        m155702Q(messageLocationM167861d);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m155698K(MessageLocation messageLocation) {
        MessageLocation messageLocation2 = this.f134905c;
        if (messageLocation2 == null || messageLocation == null) {
            return false;
        }
        return TextUtils.equals(messageLocation2.name, messageLocation.name);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m155699M(noh nohVar, View view) {
        m155703R(nohVar.f139845a, true);
    }

    /* JADX INFO: renamed from: N */
    public void m155700N(List<noh> list, MessageLocation messageLocation) {
        this.f134909g = list;
        this.f134905c = messageLocation;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: O */
    public void m155701O(InterfaceC18519a interfaceC18519a) {
        this.f134910h = interfaceC18519a;
    }

    /* JADX INFO: renamed from: Q */
    public void m155702Q(MessageLocation messageLocation) {
        m155703R(messageLocation, false);
    }

    /* JADX INFO: renamed from: R */
    public void m155703R(MessageLocation messageLocation, boolean z) {
        if (messageLocation == null) {
            return;
        }
        MessageLocation messageLocation2 = this.f134905c;
        if (messageLocation2 == null || !TextUtils.equals(messageLocation.name, messageLocation2.name)) {
            this.f134905c = messageLocation;
            notifyDataSetChanged();
            if (NullChecker.m81303a(this.f134910h)) {
                this.f134910h.mo122864l(this.f134905c);
            }
            if (z) {
                zvf0.m220396r("e_poi_tag", this.f134907e);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return getItem(i).f139846b == 1 ? 1 : 2;
    }
}

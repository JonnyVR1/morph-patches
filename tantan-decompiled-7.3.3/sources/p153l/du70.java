package p153l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLivePKCardItem;
import com.p051p1.mobile.putong.live.base.data.BLivePKCardShowList;
import com.p051p1.mobile.putong.live.base.data.BLivePKCardShowListWithBoth;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal.PkViewInternal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p151v.VImage;

/* JADX INFO: loaded from: classes5.dex */
public class du70 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public View f90759i;

    /* JADX INFO: renamed from: j */
    public VImage f90760j;

    /* JADX INFO: renamed from: k */
    public VImage f90761k;

    /* JADX INFO: renamed from: l */
    public TextView f90762l;

    /* JADX INFO: renamed from: m */
    public RecyclerView f90763m;

    /* JADX INFO: renamed from: n */
    public DialogC12774a f90764n;

    /* JADX INFO: renamed from: o */
    public LiveBaseAdapter f90765o;

    /* JADX INFO: renamed from: p */
    public PkData f90766p;

    /* JADX INFO: renamed from: q */
    public kcg0 f90767q;

    /* JADX INFO: renamed from: r */
    public List<BLivePKCardItem> f90768r;

    /* JADX INFO: renamed from: s */
    public int f90769s;

    public du70(dum dumVar) {
        super(dumVar);
        this.f90769s = 5;
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ Boolean m118085P3(hct hctVar) {
        int i = hctVar.f108745a;
        return Boolean.valueOf(i == 5 || i == 6);
    }

    /* JADX INFO: renamed from: W3 */
    private void m118089W3() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(0);
        this.f90763m.setLayoutManager(linearLayoutManager);
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f90765o = liveBaseAdapter;
        this.f90763m.setAdapter(liveBaseAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m118090Y3(View view) {
        m118095V3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m118091Z3(View view) {
        m118095V3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m118092a4(View view) {
        m138876w3(efv.f93836O, qa00.m175859d(310.0f), 600, 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m118093d4(hct hctVar) {
        this.f90769s = hctVar.f108745a;
        if (!hctVar.f108746b) {
            m118095V3();
        } else {
            if (isShowing()) {
                return;
            }
            m118101g4();
        }
    }

    private boolean isShowing() {
        DialogC12774a dialogC12774a = this.f90764n;
        return dialogC12774a != null && dialogC12774a.isShowing();
    }

    /* JADX INFO: renamed from: U3 */
    public View m118094U3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return eu70.m122539b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V3 */
    public void m118095V3() {
        DialogC12774a dialogC12774a = this.f90764n;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f90764n.dismiss();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m118096X3(BLivePKCardShowList bLivePKCardShowList) {
        this.f90768r = bLivePKCardShowList.itemCardList;
        m118102h4();
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m118097b4(DialogInterface dialogInterface) {
        psd0.m173633z(this.f90767q);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m118098c4(Long l2) {
        m118102h4();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m118099e4(BLivePKCardShowListWithBoth bLivePKCardShowListWithBoth) {
        this.f90768r = this.f90769s == 5 ? bLivePKCardShowListWithBoth.BLiveUserItemCards : bLivePKCardShowListWithBoth.BLiveOtherUserItemCardsList;
        if (isShowing()) {
            m118102h4();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m118100f4(int i) {
        PkData pkData = this.f90766p;
        duringCreated(LivingNormalApiProvider.m72413G5(this.f90766p.f52415pk.f45269id, i == 5 ? pkData.getAnchorId() : pkData.otherUserId())).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.cu70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83821a.m118096X3((BLivePKCardShowList) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [l.oo2] */
    /* JADX INFO: renamed from: g4 */
    public void m118101g4() {
        String str;
        if (this.f90764n == null) {
            this.f90764n = new c0s(this, m118094U3(act().inflater(), null));
            this.f90760j.setOnClickListener(new View.OnClickListener() { // from class: l.xt70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f196194a.m118090Y3(view);
                }
            });
            this.f90759i.setOnClickListener(new View.OnClickListener() { // from class: l.yt70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f201492a.m118091Z3(view);
                }
            });
            bnl0.m105509E0(this.f90761k, new View.OnClickListener() { // from class: l.zt70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f205942a.m118092a4(view);
                }
            });
            this.f90764n.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.au70
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f73473a.m118097b4(dialogInterface);
                }
            });
            m118089W3();
        }
        this.f90763m.scrollToPosition(0);
        this.f90766p = (PkData) m138856F3(new ru70(600));
        TextView textView = this.f90762l;
        if (this.f90769s == 5) {
            str = "PK道具卡";
        } else {
            str = xau.m209906p(this.f90766p.otherUser().name, 3) + "的PK道具卡";
        }
        textView.setText(str);
        m118100f4(this.f90769s);
        this.f90764n.show();
        psd0.m173633z(this.f90767q);
        this.f90767q = m138858H3(m213810E2().m168525i2(TimeUnit.SECONDS)).subscribe(dhw.m115825d(new y20() { // from class: l.bu70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78436a.m118098c4((Long) obj);
            }
        }));
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: h4 */
    public final void m118102h4() {
        this.f90768r = jyb.m147522n(this.f90768r, new qcj() { // from class: l.wt70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLivePKCardItem bLivePKCardItem = (BLivePKCardItem) obj;
                return Boolean.valueOf((PkViewInternal.m77241E(bLivePKCardItem.startTs, bLivePKCardItem.duration) < 0 || TextUtils.equals(bLivePKCardItem.type, "magnetCardResult") || TextUtils.equals(bLivePKCardItem.type, "critCardResult")) ? false : true);
            }
        });
        if (!isShowing() || this.f90768r == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f90768r.size(); i++) {
            arrayList.add(new bm4(this.f90768r.get(i)));
        }
        this.f90765o.m68554Z(arrayList);
        this.f90765o.notifyDataSetChanged();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().LivePkEvent.showPkDialog().m199270g()).filter(new qcj() { // from class: l.tt70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return du70.m118085P3((hct) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.ut70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180894a.m118093d4((hct) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().f71711e2).subscribe(dhw.m115829h(new y20() { // from class: l.vt70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185696a.m118099e4((BLivePKCardShowListWithBoth) obj);
            }
        }));
    }
}

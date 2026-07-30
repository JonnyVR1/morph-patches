package p149l;

import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomClass;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomSubClass;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomClassesView;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class vtl0 extends LiveMenuDialogHolder<bul0> {

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f182979k;

    /* JADX INFO: renamed from: l */
    public View f182980l;

    /* JADX INFO: renamed from: m */
    public View f182981m;

    /* JADX INFO: renamed from: n */
    public ImageView f182982n;

    /* JADX INFO: renamed from: o */
    public TextView f182983o;

    /* JADX INFO: renamed from: p */
    public ScrollView f182984p;

    /* JADX INFO: renamed from: q */
    public VirtualRoomClassesView f182985q;

    /* JADX INFO: renamed from: r */
    public TextView f182986r;

    /* JADX INFO: renamed from: s */
    public BLiveVoiceRoomSubClass f182987s;

    public vtl0(@NonNull bul0 bul0Var) {
        super(t6c0.f168038G6, bul0Var.act(), bul0Var, j2g0.m139456c(0.3f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m200041J(View view) {
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m200042K(View view) {
        BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass = this.f182987s;
        if (bLiveVoiceRoomSubClass != null) {
            ((bul0) this.f47757b).m103953Z3(bLiveVoiceRoomSubClass);
            mo71838p();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m200043I(View view) {
        wtl0.m205541a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m200044L(BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass) {
        this.f182987s = bLiveVoiceRoomSubClass;
    }

    /* JADX INFO: renamed from: M */
    public void m200045M(List<BLiveVoiceRoomClass> list) {
        this.f182985q.setSelectListener(new e30() { // from class: l.utl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178277a.m200044L((BLiveVoiceRoomSubClass) obj);
            }
        });
        this.f182985q.m77485e(list);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m200043I(view);
        xdl0.m208329E0(this.f182982n, new View.OnClickListener() { // from class: l.stl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f166373a.m200041J(view2);
            }
        });
        xdl0.m208329E0(this.f182986r, new View.OnClickListener() { // from class: l.ttl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f172034a.m200042K(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        this.f182985q.removeAllViews();
    }
}

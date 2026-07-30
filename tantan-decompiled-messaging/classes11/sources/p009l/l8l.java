package p009l;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.a;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.MigrateAwardDialogData;
import com.p1.mobile.putong.core.data.MigrateTextsData;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import l.f6c0;
import l.l3f;
import l.u4c0;
import l.v7c0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class l8l extends AbstractC1065o4 {

    /* JADX INFO: renamed from: l.l8l$a */
    public class ViewOnClickListenerC1003a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Dialog f15988a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HashMap f15989b;

        public ViewOnClickListenerC1003a(Dialog dialog, HashMap map) {
            this.f15988a = dialog;
            this.f15989b = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f15988a.dismiss();
            zvf0.s("e_clone_privilege_get_it_now", "p_clone_get_free_privilege", this.f15989b);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m17728e(z5l.C1346a c1346a, MigrateAwardDialogData migrateAwardDialogData) {
        HashMap map = new HashMap();
        Dialog dialogZ = c1346a.m25611a().dialog().L(v7c0.o).M(f6c0.Yc).z();
        dialogZ.show();
        View viewP = dialogZ.P();
        ImageView imageView = (ImageView) viewP.findViewById(u4c0.A6);
        VText vTextFindViewById = viewP.findViewById(u4c0.Ie);
        VText vTextFindViewById2 = viewP.findViewById(u4c0.ze);
        VText vTextFindViewById3 = viewP.findViewById(u4c0.H0);
        vTextFindViewById3.setText(R.string.C8);
        if (TextUtils.equals(migrateAwardDialogData.type, "boost")) {
            map.put("privilege_type", "superlike_and_boost");
            if (TextUtils.isEmpty(migrateAwardDialogData.picUrl)) {
                imageView.setImageResource(x2c0.Wr);
            } else {
                a.v(imageView).t(migrateAwardDialogData.picUrl).j(x2c0.Wr).w0(imageView);
            }
            vTextFindViewById2.setText(R.string.B8);
        } else {
            map.put("privilege_type", "superlike");
            if (TextUtils.isEmpty(migrateAwardDialogData.picUrl)) {
                imageView.setImageResource(x2c0.Vr);
            } else {
                a.v(imageView).t(migrateAwardDialogData.picUrl).j(x2c0.Vr).w0(imageView);
            }
            vTextFindViewById2.setText(R.string.D8);
        }
        MigrateTextsData migrateTextsData = migrateAwardDialogData.texts;
        if (migrateTextsData != null) {
            if (!TextUtils.isEmpty(migrateTextsData.title)) {
                vTextFindViewById.setText(migrateAwardDialogData.texts.title);
            }
            if (!TextUtils.isEmpty(migrateAwardDialogData.texts.content)) {
                vTextFindViewById2.setText(migrateAwardDialogData.texts.content);
            }
            if (!TextUtils.isEmpty(migrateAwardDialogData.texts.learnMore)) {
                vTextFindViewById3.setText(migrateAwardDialogData.texts.learnMore);
            }
        }
        xdl0.E0(vTextFindViewById3, new ViewOnClickListenerC1003a(dialogZ, map));
        l3f l3fVar = new l3f();
        l3fVar.n = "p_clone_get_free_privilege";
        l3fVar.d = EventNameEnum.PAGE_VIEW;
        zvf0.n(l3fVar, map);
        CoreModule.c.Q0.u3();
        CoreModule.c.C0.x4();
        CoreModule.c.e0.H9();
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo1468a(z5l.C1346a c1346a) {
        MigrateAwardDialogData migrateAwardDialogDataV3 = CoreModule.c.Q0.v3();
        if (migrateAwardDialogDataV3 == null || !migrateAwardDialogDataV3.showDialog) {
            return Boolean.TRUE;
        }
        m17728e(c1346a, migrateAwardDialogDataV3);
        return Boolean.TRUE;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(z5l.C1346a c1346a) {
        return NullChecker.a(CoreModule.c.Q0.v3());
    }
}

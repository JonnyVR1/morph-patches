package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C1053a;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.MigrateAwardDialogData;
import com.p046p1.mobile.putong.core.data.MigrateTextsData;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class l8l extends AbstractC18834o4 {

    /* JADX INFO: renamed from: l.l8l$a */
    public class ViewOnClickListenerC18168a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Dialog f126833a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HashMap f126834b;

        public ViewOnClickListenerC18168a(Dialog dialog, HashMap map) {
            this.f126833a = dialog;
            this.f126834b = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f126833a.dismiss();
            zvf0.m220397s("e_clone_privilege_get_it_now", "p_clone_get_free_privilege", this.f126834b);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m148922e(z5l.C21640a c21640a, MigrateAwardDialogData migrateAwardDialogData) {
        HashMap map = new HashMap();
        Dialog dialogM20567z = c21640a.m217363a().dialog().m20516L(v7c0.f180368o).m20517M(f6c0.f95663Yc).m20567z();
        dialogM20567z.show();
        View viewM20458P = dialogM20567z.m20458P();
        ImageView imageView = (ImageView) viewM20458P.findViewById(u4c0.f173723A6);
        VText vText = (VText) viewM20458P.findViewById(u4c0.f173867Ie);
        VText vText2 = (VText) viewM20458P.findViewById(u4c0.f174590ze);
        VText vText3 = (VText) viewM20458P.findViewById(u4c0.f173836H0);
        vText3.setText(R$string.f17635C8);
        if (TextUtils.equals(migrateAwardDialogData.type, "boost")) {
            map.put("privilege_type", "superlike_and_boost");
            if (TextUtils.isEmpty(migrateAwardDialogData.picUrl)) {
                imageView.setImageResource(x2c0.f189869Wr);
            } else {
                ComponentCallbacks2C1053a.m5317v(imageView).m143276t(migrateAwardDialogData.picUrl).m199430j(x2c0.f189869Wr).m199993w0(imageView);
            }
            vText2.setText(R$string.f17605B8);
        } else {
            map.put("privilege_type", "superlike");
            if (TextUtils.isEmpty(migrateAwardDialogData.picUrl)) {
                imageView.setImageResource(x2c0.f189838Vr);
            } else {
                ComponentCallbacks2C1053a.m5317v(imageView).m143276t(migrateAwardDialogData.picUrl).m199430j(x2c0.f189838Vr).m199993w0(imageView);
            }
            vText2.setText(R$string.f17665D8);
        }
        MigrateTextsData migrateTextsData = migrateAwardDialogData.texts;
        if (migrateTextsData != null) {
            if (!TextUtils.isEmpty(migrateTextsData.title)) {
                vText.setText(migrateAwardDialogData.texts.title);
            }
            if (!TextUtils.isEmpty(migrateAwardDialogData.texts.content)) {
                vText2.setText(migrateAwardDialogData.texts.content);
            }
            if (!TextUtils.isEmpty(migrateAwardDialogData.texts.learnMore)) {
                vText3.setText(migrateAwardDialogData.texts.learnMore);
            }
        }
        xdl0.m208329E0(vText3, new ViewOnClickListenerC18168a(dialogM20567z, map));
        l3f l3fVar = new l3f();
        l3fVar.f125895n = "p_clone_get_free_privilege";
        l3fVar.f125885d = EventNameEnum.PAGE_VIEW;
        zvf0.m220392n(l3fVar, map);
        CoreModule.f17545c.f19597Q0.m173711u3();
        CoreModule.f17545c.f19555C0.m210115x4();
        CoreModule.f17545c.f19639e0.m169397H9();
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo37497a(z5l.C21640a c21640a) {
        MigrateAwardDialogData migrateAwardDialogDataM173712v3 = CoreModule.f17545c.f19597Q0.m173712v3();
        if (migrateAwardDialogDataM173712v3 == null || !migrateAwardDialogDataM173712v3.showDialog) {
            return Boolean.TRUE;
        }
        m148922e(c21640a, migrateAwardDialogDataM173712v3);
        return Boolean.TRUE;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(z5l.C21640a c21640a) {
        return NullChecker.m81303a(CoreModule.f17545c.f19597Q0.m173712v3());
    }
}

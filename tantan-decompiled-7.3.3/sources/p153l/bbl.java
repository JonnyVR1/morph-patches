package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C1057a;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.MigrateAwardDialogData;
import com.p051p1.mobile.putong.core.data.MigrateTextsData;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class bbl extends AbstractC18774n4 {

    /* JADX INFO: renamed from: l.bbl$a */
    public class ViewOnClickListenerC15964a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Dialog f75963a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HashMap f75964b;

        public ViewOnClickListenerC15964a(Dialog dialog, HashMap map) {
            this.f75963a = dialog;
            this.f75964b = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f75963a.dismiss();
            i4g0.m138521s("e_clone_privilege_get_it_now", "p_clone_get_free_privilege", this.f75964b);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m103284e(p8l.C19323a c19323a, MigrateAwardDialogData migrateAwardDialogData) {
        HashMap map = new HashMap();
        Dialog dialogM21566z = c19323a.m171258a().dialog().m21515L(agc0.f71129o).m21516M(kec0.f125835fd).m21566z();
        dialogM21566z.show();
        View viewM21457P = dialogM21566z.m21457P();
        ImageView imageView = (ImageView) viewM21457P.findViewById(adc0.f69845C6);
        VText vText = (VText) viewM21457P.findViewById(adc0.f70006Le);
        VText vText2 = (VText) viewM21457P.findViewById(adc0.f69853Ce);
        VText vText3 = (VText) viewM21457P.findViewById(adc0.f69924H0);
        vText3.setText(R$string.f18418E8);
        if (TextUtils.equals(migrateAwardDialogData.type, "boost")) {
            map.put("privilege_type", "superlike_and_boost");
            if (TextUtils.isEmpty(migrateAwardDialogData.picUrl)) {
                imageView.setImageResource(dbc0.f86325Ks);
            } else {
                ComponentCallbacks2C1057a.m5326u(imageView).m156821t(migrateAwardDialogData.picUrl).m155557j(dbc0.f86325Ks).m95652x0(imageView);
            }
            vText2.setText(R$string.f18387D8);
        } else {
            map.put("privilege_type", "superlike");
            if (TextUtils.isEmpty(migrateAwardDialogData.picUrl)) {
                imageView.setImageResource(dbc0.f86293Js);
            } else {
                ComponentCallbacks2C1057a.m5326u(imageView).m156821t(migrateAwardDialogData.picUrl).m155557j(dbc0.f86293Js).m95652x0(imageView);
            }
            vText2.setText(R$string.f18449F8);
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
        bnl0.m105509E0(vText3, new ViewOnClickListenerC15964a(dialogM21566z, map));
        q4f q4fVar = new q4f();
        q4fVar.f155576n = "p_clone_get_free_privilege";
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        i4g0.m138516n(q4fVar, map);
        CoreModule.f18264c.f20339Q0.m115265u3();
        CoreModule.f18264c.f20297C0.m146428y4();
        CoreModule.f18264c.f20381e0.m116470H9();
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo38500a(p8l.C19323a c19323a) {
        MigrateAwardDialogData migrateAwardDialogDataM115266v3 = CoreModule.f18264c.f20339Q0.m115266v3();
        if (migrateAwardDialogDataM115266v3 == null || !migrateAwardDialogDataM115266v3.showDialog) {
            return Boolean.TRUE;
        }
        m103284e(c19323a, migrateAwardDialogDataM115266v3);
        return Boolean.TRUE;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(p8l.C19323a c19323a) {
        return NullChecker.m82486a(CoreModule.f18264c.f20339Q0.m115266v3());
    }
}

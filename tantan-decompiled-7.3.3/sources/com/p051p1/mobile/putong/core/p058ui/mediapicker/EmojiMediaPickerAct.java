package com.p051p1.mobile.putong.core.p058ui.mediapicker;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import p151v.VText;
import p153l.bnl0;
import p153l.o1j0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class EmojiMediaPickerAct extends MediaPickerAct {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m48948y2(View view) {
        if (this.f31488z.size() > 0) {
            Intent intent = new Intent();
            intent.putExtra(MediaPickerBaseAct.f55451h, this.f31488z);
            setResult(-1, intent);
        }
        m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m48949z2(Bundle bundle) {
        setTitle(R$string.f19419l4);
        this.f31473B.f202449k.setOnClickListener(new View.OnClickListener() { // from class: l.eze
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96582a.m48948y2(view);
            }
        });
        mo48950f();
        this.f31473B.f202448j.setVisibility(8);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct, p153l.yyl
    /* JADX INFO: renamed from: f */
    public void mo48950f() {
        String str;
        int size = this.f31488z.size();
        bnl0.m105591y(this.f31473B.f202449k, size > 0);
        VText vText = this.f31473B.f202449k;
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R$string.f19388k4));
        if (size <= 0) {
            str = "";
        } else {
            str = "(" + size + ")";
        }
        sb.append(str);
        vText.setText(sb.toString());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct, p153l.yyl
    /* JADX INFO: renamed from: i */
    public boolean mo48951i(Media media, boolean z) {
        boolean z2 = true;
        if (!z) {
            this.f31488z.remove(media);
        } else if (this.f31474l == this.f31488z.size()) {
            o1j0.m165634h(R$string.f19481n4);
            z2 = false;
        } else {
            this.f31488z.add(media);
        }
        mo48950f();
        return z2;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.dze
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91353a.m48949z2((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct, p153l.yyl
    /* JADX INFO: renamed from: j */
    public void mo48952j(View view, Media media) {
        boolean z = this.f31488z.indexOf(media) == -1;
        if (mo48951i(media, z)) {
            ((MediaItemView) view).f31468e.m224249e(z, true);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f31485w = getIntent().getIntExtra("spanCount", 3);
    }
}

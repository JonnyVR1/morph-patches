package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.PhotoPreviewView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mb70 {
    /* JADX INFO: renamed from: a */
    public static void m8134a(PhotoPreviewView photoPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        photoPreviewView.a = viewGroup.getChildAt(0);
        photoPreviewView.b = viewGroup.getChildAt(1);
        photoPreviewView.c = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        photoPreviewView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        photoPreviewView.e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8135b(PhotoPreviewView photoPreviewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.xf, viewGroup, true);
        m8134a(photoPreviewView, viewInflate);
        return viewInflate;
    }
}

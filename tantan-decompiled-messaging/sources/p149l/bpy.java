package p149l;

import android.graphics.Color;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemType;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemView;

/* JADX INFO: loaded from: classes3.dex */
public class bpy extends uoy {

    /* JADX INFO: renamed from: i */
    public int f76687i;

    /* JADX INFO: renamed from: j */
    public int f76688j;

    /* JADX INFO: renamed from: k */
    public int f76689k;

    /* JADX INFO: renamed from: l */
    public int f76690l;

    public bpy(MessageBarActionItemType messageBarActionItemType, int i) {
        super(messageBarActionItemType, i, -1);
        this.f76687i = -1;
        this.f76688j = -1;
        this.f76689k = -1;
        this.f76690l = -1;
    }

    @Override // p149l.uoy
    /* JADX INFO: renamed from: c */
    public void mo98197c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        super.mo98197c(messageBarActionItemView, i, i2);
        if (m194574e(2)) {
            if (m194574e(1)) {
                messageBarActionItemView.f31928a.setColorFilter(this.f76690l);
                return;
            } else {
                messageBarActionItemView.f31928a.setColorFilter(this.f76689k);
                return;
            }
        }
        if (m194574e(1)) {
            int i3 = this.f76688j;
            if (i3 > 0) {
                messageBarActionItemView.f31928a.setColorFilter(i3);
                return;
            }
            return;
        }
        int i4 = this.f76687i;
        if (i4 > 0) {
            messageBarActionItemView.f31928a.setColorFilter(i4);
        }
    }

    /* JADX INFO: renamed from: l */
    public bpy mo103098l(int i) {
        this.f76687i = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public int m103099m(int i, int i2, int i3) {
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        int iAlpha = Color.alpha(i);
        int iRed2 = Color.red(i2);
        int iGreen2 = Color.green(i2);
        return Color.argb(iAlpha + ((i3 * (Color.alpha(i2) - iAlpha)) / 100), iRed + (((iRed2 - iRed) * i3) / 100), iGreen + (((iGreen2 - iGreen) * i3) / 100), iBlue + (((Color.blue(i2) - iBlue) * i3) / 100));
    }

    /* JADX INFO: renamed from: n */
    public bpy mo103100n(int i) {
        this.f76688j = i;
        return this;
    }

    public bpy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        super(messageBarActionItemType, i, i2);
        this.f76687i = -1;
        this.f76688j = -1;
        this.f76689k = -1;
        this.f76690l = -1;
    }
}

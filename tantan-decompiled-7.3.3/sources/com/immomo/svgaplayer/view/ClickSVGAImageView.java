package com.immomo.svgaplayer.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.immomo.svgaplayer.SVGADynamicEntity;
import com.immomo.svgaplayer.SVGAImageView;
import com.immomo.svgaplayer.listener.IClickAreaListener;
import com.immomo.svgaplayer.listener.SVGAClickAreaListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB+\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0017J\b\u0010*\u001a\u00020%H\u0004R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00160\u0015j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0016`\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006+"}, m88121d2 = {"Lcom/immomo/svgaplayer/view/ClickSVGAImageView;", "Lcom/immomo/svgaplayer/SVGAImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mClickKeyList", "", "", "getMClickKeyList", "()Ljava/util/List;", "setMClickKeyList", "(Ljava/util/List;)V", "mClickMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "mItemClickAreaListener", "Lcom/immomo/svgaplayer/listener/SVGAClickAreaListener;", "getMItemClickAreaListener", "()Lcom/immomo/svgaplayer/listener/SVGAClickAreaListener;", "setMItemClickAreaListener", "(Lcom/immomo/svgaplayer/listener/SVGAClickAreaListener;)V", "mSVGAEntity", "Lcom/immomo/svgaplayer/SVGADynamicEntity;", "getMSVGAEntity", "()Lcom/immomo/svgaplayer/SVGADynamicEntity;", "setMSVGAEntity", "(Lcom/immomo/svgaplayer/SVGADynamicEntity;)V", "clearInsertData", "", "onTouchEvent", "", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "setClickArea", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
public class ClickSVGAImageView extends SVGAImageView {

    @NotNull
    private List<String> mClickKeyList;
    private HashMap<String, int[]> mClickMap;

    @Nullable
    private SVGAClickAreaListener mItemClickAreaListener;

    @Nullable
    private SVGADynamicEntity mSVGAEntity;

    public ClickSVGAImageView(@Nullable Context context) {
        super(context);
        this.mClickKeyList = new ArrayList();
        this.mClickMap = new HashMap<>();
    }

    public void clearInsertData() {
        SVGADynamicEntity sVGADynamicEntity = this.mSVGAEntity;
        if (sVGADynamicEntity != null) {
            sVGADynamicEntity.clearDynamicObjects();
        }
        this.mItemClickAreaListener = null;
        this.mClickKeyList.clear();
        this.mClickMap.clear();
    }

    @NotNull
    public final List<String> getMClickKeyList() {
        return this.mClickKeyList;
    }

    @Nullable
    public final SVGAClickAreaListener getMItemClickAreaListener() {
        return this.mItemClickAreaListener;
    }

    @Nullable
    public final SVGADynamicEntity getMSVGAEntity() {
        return this.mSVGAEntity;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        SVGAClickAreaListener sVGAClickAreaListener;
        if (event != null && event.getAction() == 0) {
            for (Map.Entry<String, int[]> entry : this.mClickMap.entrySet()) {
                String key = entry.getKey();
                int[] value = entry.getValue();
                if (event.getX() >= value[0] && event.getX() <= value[2] && event.getY() >= value[1] && event.getY() <= value[3] && (sVGAClickAreaListener = this.mItemClickAreaListener) != null) {
                    sVGAClickAreaListener.onClick(key);
                    return true;
                }
            }
        }
        return super.onTouchEvent(event);
    }

    public final void setClickArea() {
        for (String str : this.mClickKeyList) {
            SVGADynamicEntity sVGADynamicEntity = this.mSVGAEntity;
            if (sVGADynamicEntity != null) {
                sVGADynamicEntity.setClickArea(str, new IClickAreaListener() { // from class: com.immomo.svgaplayer.view.ClickSVGAImageView.setClickArea.1
                    @Override // com.immomo.svgaplayer.listener.IClickAreaListener
                    public void onResponseArea(@NotNull String key, int x0, int y0, int x1, int y1) {
                        key.getClass();
                        HashMap map = ClickSVGAImageView.this.mClickMap;
                        if (map.get(key) == null) {
                            map.put(key, new int[]{x0, y0, x1, y1});
                            return;
                        }
                        int[] iArr = (int[]) map.get(key);
                        if (iArr != null) {
                            iArr[0] = x0;
                            iArr[1] = y0;
                            iArr[2] = x1;
                            iArr[3] = y1;
                        }
                    }
                });
            }
        }
    }

    public final void setMClickKeyList(@NotNull List<String> list) {
        list.getClass();
        this.mClickKeyList = list;
    }

    public final void setMItemClickAreaListener(@Nullable SVGAClickAreaListener sVGAClickAreaListener) {
        this.mItemClickAreaListener = sVGAClickAreaListener;
    }

    public final void setMSVGAEntity(@Nullable SVGADynamicEntity sVGADynamicEntity) {
        this.mSVGAEntity = sVGADynamicEntity;
    }

    public ClickSVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mClickKeyList = new ArrayList();
        this.mClickMap = new HashMap<>();
    }

    public ClickSVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mClickKeyList = new ArrayList();
        this.mClickMap = new HashMap<>();
    }

    public ClickSVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mClickKeyList = new ArrayList();
        this.mClickMap = new HashMap<>();
    }
}

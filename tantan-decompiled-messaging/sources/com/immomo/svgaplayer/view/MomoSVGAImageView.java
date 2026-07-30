package com.immomo.svgaplayer.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.Html;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.clevertap.android.sdk.Constants;
import com.immomo.svgaplayer.ErrorConstant;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.immomo.svgaplayer.SVGADrawable;
import com.immomo.svgaplayer.SVGADynamicEntity;
import com.immomo.svgaplayer.SVGAParser;
import com.immomo.svgaplayer.SVGAVideoEntity;
import com.immomo.svgaplayer.adapter.SVGAGotoAdapter;
import com.immomo.svgaplayer.adapter.SVGAImgLoadAdapter;
import com.immomo.svgaplayer.adapter.SVGAResLoadAdapter;
import com.immomo.svgaplayer.adaptercallback.SVGAImgLoadCallBack;
import com.immomo.svgaplayer.adaptercallback.SVGAResLoadCallBack;
import com.immomo.svgaplayer.bean.BaseInsertBean;
import com.immomo.svgaplayer.bean.BoringLayoutBean;
import com.immomo.svgaplayer.bean.InsertClickBean;
import com.immomo.svgaplayer.bean.InsertImgBean;
import com.immomo.svgaplayer.bean.InsertTextBean;
import com.immomo.svgaplayer.bean.StaticLayoutBean;
import com.immomo.svgaplayer.htmlParser.HtmlTagHandler;
import com.immomo.svgaplayer.listener.SVGAClickAreaListener;
import com.immomo.svgaplayer.setting.SVGAAdapterContainer;
import com.immomo.svgaplayer.setting.SVGAEntityCacheLoader;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB+\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0011H\u0002J\u0010\u0010+\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010-J\u0016\u0010.\u001a\u00020\u00002\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020-\u0018\u000100J\u0012\u00101\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010-H\u0002J\u001a\u00101\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\u00112\b\u00104\u001a\u0004\u0018\u000105J \u00101\u001a\u00020\u00002\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001002\b\u00104\u001a\u0004\u0018\u000105J*\u00107\u001a\u00020(2\"\u00108\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011`\u0012J\u0014\u00109\u001a\u00020(2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u0014\u0010;\u001a\u00020(2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014J\u0012\u0010=\u001a\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010\u0015H\u0002J\u0012\u0010?\u001a\u00020\u00002\b\u0010@\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010A\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0011H\u0002J\u0010\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020\u0011H\u0002J\b\u0010D\u001a\u00020(H\u0002J*\u0010E\u001a\u00020(2\b\u0010C\u001a\u0004\u0018\u00010\u00112\u0006\u0010F\u001a\u00020\t2\b\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u00020\u000eJ\u0010\u0010J\u001a\u00020(2\u0006\u0010K\u001a\u00020LH\u0016J\b\u0010M\u001a\u00020(H\u0014J\u0010\u0010N\u001a\u00020(2\u0006\u0010O\u001a\u00020\u0011H\u0016J\u0018\u0010P\u001a\u00020(2\b\u0010C\u001a\u0004\u0018\u00010\u00112\u0006\u0010F\u001a\u00020\tJ*\u0010Q\u001a\u00020(2\b\u0010C\u001a\u0004\u0018\u00010\u00112\u0006\u0010F\u001a\u00020\t2\b\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010$\u001a\u00020\tJ*\u0010R\u001a\u00020(2\b\u0010C\u001a\u0004\u0018\u00010\u00112\u0006\u0010F\u001a\u00020\t2\b\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010%\u001a\u00020&J,\u0010S\u001a\u00020(2\b\u0010T\u001a\u0004\u0018\u00010\u00112\u0006\u0010F\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u0001052\b\u0010G\u001a\u0004\u0018\u00010HJ,\u0010S\u001a\u00020(2\b\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010F\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u0001052\b\u0010G\u001a\u0004\u0018\u00010HJ\"\u0010W\u001a\u00020(2\b\u0010C\u001a\u0004\u0018\u00010\u00112\u0006\u0010F\u001a\u00020\t2\b\u0010G\u001a\u0004\u0018\u00010HJ2\u0010X\u001a\u00020(2\b\u0010C\u001a\u0004\u0018\u00010\u00112\u0006\u0010F\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t2\b\u0010G\u001a\u0004\u0018\u00010HJ\u0006\u0010Z\u001a\u00020(R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u000eX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006["}, m87232d2 = {"Lcom/immomo/svgaplayer/view/MomoSVGAImageView;", "Lcom/immomo/svgaplayer/view/ClickSVGAImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "loadStart", "", "mClickGoto", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "mInsertImgSimList", "", "Lcom/immomo/svgaplayer/bean/InsertImgBean;", "mInsertTextSimList", "Lcom/immomo/svgaplayer/bean/InsertTextBean;", "mResourceUrl", "getMResourceUrl", "()Ljava/lang/String;", "setMResourceUrl", "(Ljava/lang/String;)V", "mSVGAParser", "Lcom/immomo/svgaplayer/SVGAParser;", "mStopPlay", "getMStopPlay", "()Z", "setMStopPlay", "(Z)V", "startFrame", "stepToPercentage", "", "clearInsertData", "", "fileIsExists", "path", "insertBean", "bean", "Lcom/immomo/svgaplayer/bean/BaseInsertBean;", "insertBeanList", "beanList", "", "insertClickArea", "insertClickBean", "clickKey", "itemClickAreaListener", "Lcom/immomo/svgaplayer/listener/SVGAClickAreaListener;", "clickKeyList", "insertDrawerGoto", "gotoMap", "insertDrawerImg", "imgList", "insertDrawerText", "textList", "insertImgBean", "imgBean", "insertTextBean", "textBean", "loadLocalResource", "loadNetSVGA", "url", "loadSVGA", "loadSVGAAnimWithListener", "loop", "animListener", "Lcom/immomo/svgaplayer/SVGAAnimListenerAdapter;", "autoPlay", "onComplete", "videoItem", "Lcom/immomo/svgaplayer/SVGAVideoEntity;", "onDetachedFromWindow", "onError", "error", "startSVGAAnim", "startSVGAAnimAndStepToFrame", "startSVGAAnimAndStepToPercentage", "startSVGAAnimWithJson", "jsonStr", "jsonObject", "Lorg/json/JSONObject;", "startSVGAAnimWithListener", "startSVGAAnimWithRange", "endFrame", "stopAnimCompletely", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
public class MomoSVGAImageView extends ClickSVGAImageView {
    private boolean loadStart;
    private final HashMap<String, String> mClickGoto;
    private final List<InsertImgBean> mInsertImgSimList;
    private final List<InsertTextBean> mInsertTextSimList;

    @Nullable
    private String mResourceUrl;
    private SVGAParser mSVGAParser;
    private boolean mStopPlay;
    private int startFrame;
    private double stepToPercentage;

    /* JADX INFO: renamed from: com.immomo.svgaplayer.view.MomoSVGAImageView$loadNetSVGA$1 */
    @Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m87232d2 = {"com/immomo/svgaplayer/view/MomoSVGAImageView$loadNetSVGA$1", "Lcom/immomo/svgaplayer/adaptercallback/SVGAResLoadCallBack;", "(Lcom/immomo/svgaplayer/view/MomoSVGAImageView;)V", "onResLoadFail", "", "onResLoadSuccess", "filePath", "", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
    public static final class C39731 implements SVGAResLoadCallBack {
        public C39731() {
        }

        @Override // com.immomo.svgaplayer.adaptercallback.SVGAResLoadCallBack
        public void onResLoadFail() {
            Context context = MomoSVGAImageView.this.getContext();
            context.getClass();
            new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.immomo.svgaplayer.view.MomoSVGAImageView$loadNetSVGA$1$onResLoadFail$1
                @Override // java.lang.Runnable
                public final void run() {
                    MomoSVGAImageView.this.onError(ErrorConstant.INSTANCE.getERROR_MMSVGA_RES_REMOTE_LOAD());
                }
            });
        }

        @Override // com.immomo.svgaplayer.adaptercallback.SVGAResLoadCallBack
        public void onResLoadSuccess(@NotNull String filePath) {
            filePath.getClass();
            MomoSVGAImageView.this.loadLocalResource(filePath);
        }
    }

    public MomoSVGAImageView(@Nullable Context context) {
        super(context);
        this.mInsertImgSimList = new ArrayList();
        this.mInsertTextSimList = new ArrayList();
        this.mClickGoto = new HashMap<>();
        this.stepToPercentage = DoubleCompanionObject.INSTANCE.m87479a();
    }

    private final boolean fileIsExists(String path) {
        try {
            return new File(path).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    private final MomoSVGAImageView insertClickArea(BaseInsertBean insertClickBean) {
        if (insertClickBean != null && !TextUtils.isEmpty(insertClickBean.getKey()) && !TextUtils.isEmpty(insertClickBean.getAction())) {
            getMClickKeyList().add(insertClickBean.getKey());
            this.mClickGoto.put(insertClickBean.getKey(), insertClickBean.getAction());
        }
        return this;
    }

    private final MomoSVGAImageView insertImgBean(InsertImgBean imgBean) {
        if (imgBean != null) {
            this.mInsertImgSimList.add(imgBean);
            if (imgBean.getIsClick()) {
                insertClickArea(imgBean);
            }
        }
        return this;
    }

    private final MomoSVGAImageView insertTextBean(InsertTextBean textBean) {
        if (textBean != null) {
            this.mInsertTextSimList.add(textBean);
            if (textBean.getIsClick()) {
                insertClickArea(textBean);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadLocalResource(String path) {
        SVGAParser sVGAParser = this.mSVGAParser;
        if (sVGAParser != null) {
            sVGAParser.parseFile(path, this, true);
        }
    }

    private final void loadNetSVGA(String url) {
        SVGAResLoadAdapter mSVGAResLoadAdapter = SVGAAdapterContainer.INSTANCE.getMSVGAResLoadAdapter();
        if (mSVGAResLoadAdapter != null) {
            mSVGAResLoadAdapter.loadSVGARes(true, url, new C39731());
            return;
        }
        SVGAParser sVGAParser = this.mSVGAParser;
        if (sVGAParser != null) {
            sVGAParser.parse(new URL(url), this);
        }
    }

    private final void loadSVGA() {
        Context context;
        this.loadStart = true;
        if (TextUtils.isEmpty(this.mResourceUrl)) {
            onError(ErrorConstant.INSTANCE.getERROR_MMSVGA_RESURL());
            return;
        }
        if (this.mSVGAParser == null && (context = getContext()) != null) {
            this.mSVGAParser = new SVGAParser(context);
            Unit unit = Unit.INSTANCE;
        }
        SVGADynamicEntity mSVGAEntity = getMSVGAEntity();
        if (mSVGAEntity != null) {
            mSVGAEntity.clearDynamicObjects();
        } else {
            setMSVGAEntity(new SVGADynamicEntity());
        }
        insertDrawerImg(this.mInsertImgSimList);
        insertDrawerText(this.mInsertTextSimList);
        insertDrawerGoto(this.mClickGoto);
        setClickArea();
        String str = this.mResourceUrl;
        if (str != null) {
            SVGAVideoEntity entity = SVGAEntityCacheLoader.INSTANCE.get().getEntity(str);
            if (entity != null) {
                onComplete(entity);
                return;
            }
            if (C15386d.m93483J(str, "http", false, 2, null)) {
                loadNetSVGA(str);
                return;
            }
            if (fileIsExists(str)) {
                loadLocalResource(str);
                return;
            }
            SVGAParser sVGAParser = this.mSVGAParser;
            if (sVGAParser != null) {
                sVGAParser.parse("svga/".concat(str), this);
            }
        }
    }

    @Override // com.immomo.svgaplayer.view.ClickSVGAImageView
    public void clearInsertData() {
        super.clearInsertData();
        this.mInsertTextSimList.clear();
        this.mInsertImgSimList.clear();
        this.mClickGoto.clear();
    }

    @Nullable
    public final String getMResourceUrl() {
        return this.mResourceUrl;
    }

    public final boolean getMStopPlay() {
        return this.mStopPlay;
    }

    @NotNull
    public final MomoSVGAImageView insertBean(@Nullable BaseInsertBean bean) {
        if (bean instanceof InsertClickBean) {
            insertClickArea(bean);
        }
        if (bean instanceof InsertImgBean) {
            insertImgBean((InsertImgBean) bean);
        }
        if (bean instanceof InsertTextBean) {
            insertTextBean((InsertTextBean) bean);
        }
        return this;
    }

    @NotNull
    public final MomoSVGAImageView insertBeanList(@Nullable List<? extends BaseInsertBean> beanList) {
        if (beanList != null) {
            Iterator<? extends BaseInsertBean> it = beanList.iterator();
            while (it.hasNext()) {
                insertBean(it.next());
            }
        }
        return this;
    }

    public final void insertDrawerGoto(@NotNull final HashMap<String, String> gotoMap) {
        gotoMap.getClass();
        if (gotoMap.size() != 0) {
            List<String> mClickKeyList = getMClickKeyList();
            Set<String> setKeySet = gotoMap.keySet();
            setKeySet.getClass();
            mClickKeyList.addAll(setKeySet);
            setMItemClickAreaListener(new SVGAClickAreaListener() { // from class: com.immomo.svgaplayer.view.MomoSVGAImageView.insertDrawerGoto.1
                @Override // com.immomo.svgaplayer.listener.SVGAClickAreaListener
                public void onClick(@NotNull String clickKey) {
                    SVGAGotoAdapter mSVGAGotoAdapter;
                    clickKey.getClass();
                    String str = (String) gotoMap.get(clickKey);
                    if (str == null || (mSVGAGotoAdapter = SVGAAdapterContainer.INSTANCE.getMSVGAGotoAdapter()) == null) {
                        return;
                    }
                    Context context = MomoSVGAImageView.this.getContext();
                    context.getClass();
                    mSVGAGotoAdapter.executeGoto(context, clickKey, str);
                }
            });
        }
    }

    public final void insertDrawerImg(@NotNull List<InsertImgBean> imgList) {
        imgList.getClass();
        for (final InsertImgBean insertImgBean : imgList) {
            if (!TextUtils.isEmpty(insertImgBean.getKey())) {
                Bitmap bitmap = insertImgBean.getBitmap();
                if (bitmap != null) {
                    Unit unit = null;
                    if (insertImgBean.getIsCircle()) {
                        SVGADynamicEntity mSVGAEntity = getMSVGAEntity();
                        if (mSVGAEntity != null) {
                            mSVGAEntity.setDynamicCircleImage(insertImgBean.getKey(), bitmap);
                            unit = Unit.INSTANCE;
                        }
                    } else {
                        SVGADynamicEntity mSVGAEntity2 = getMSVGAEntity();
                        if (mSVGAEntity2 != null) {
                            mSVGAEntity2.setDynamicRadiusImage(insertImgBean.getKey(), bitmap, insertImgBean.getRadius(), insertImgBean.getCorner());
                            unit = Unit.INSTANCE;
                        }
                    }
                    if (unit != null) {
                    }
                }
                if (!TextUtils.isEmpty(insertImgBean.getImgUrl())) {
                    SVGAImgLoadAdapter mSVGAImgLoadAdapter = SVGAAdapterContainer.INSTANCE.getMSVGAImgLoadAdapter();
                    if (mSVGAImgLoadAdapter != null) {
                        Context context = getContext();
                        context.getClass();
                        mSVGAImgLoadAdapter.loadSVGAImg(context, insertImgBean.getImgUrl(), new SVGAImgLoadCallBack() { // from class: com.immomo.svgaplayer.view.MomoSVGAImageView$insertDrawerImg$$inlined$let$lambda$1
                            @Override // com.immomo.svgaplayer.adaptercallback.SVGAImgLoadCallBack
                            public void onImgLoadFail() {
                            }

                            @Override // com.immomo.svgaplayer.adaptercallback.SVGAImgLoadCallBack
                            public void onImgLoadSuccess(@NotNull Bitmap bitmap2) {
                                bitmap2.getClass();
                                boolean isCircle = insertImgBean.getIsCircle();
                                MomoSVGAImageView momoSVGAImageView = this.this$0;
                                if (isCircle) {
                                    SVGADynamicEntity mSVGAEntity3 = momoSVGAImageView.getMSVGAEntity();
                                    if (mSVGAEntity3 != null) {
                                        mSVGAEntity3.setDynamicCircleImage(insertImgBean.getKey(), bitmap2);
                                        return;
                                    }
                                    return;
                                }
                                SVGADynamicEntity mSVGAEntity4 = momoSVGAImageView.getMSVGAEntity();
                                if (mSVGAEntity4 != null) {
                                    mSVGAEntity4.setDynamicRadiusImage(insertImgBean.getKey(), bitmap2, insertImgBean.getRadius(), insertImgBean.getCorner());
                                }
                            }
                        });
                    } else {
                        SVGADynamicEntity mSVGAEntity3 = getMSVGAEntity();
                        if (mSVGAEntity3 != null) {
                            mSVGAEntity3.setDynamicImage(insertImgBean.getImgUrl(), insertImgBean.getKey());
                        }
                    }
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public final void insertDrawerText(@NotNull List<InsertTextBean> textList) {
        textList.getClass();
        for (InsertTextBean insertTextBean : textList) {
            if (!TextUtils.isEmpty(insertTextBean.getKey())) {
                if (!TextUtils.isEmpty(insertTextBean.getRichText())) {
                    Context context = getContext();
                    context.getClass();
                    HtmlTagHandler htmlTagHandler = new HtmlTagHandler(context);
                    Spanned spannedFromHtml = Html.fromHtml(insertTextBean.getRichText(), htmlTagHandler, htmlTagHandler);
                    TextPaint textPaint = new TextPaint();
                    textPaint.setTypeface(insertTextBean.getTypeFace());
                    textPaint.setColor(insertTextBean.getTextColor());
                    textPaint.setTextSize(insertTextBean.getTextSize());
                    if (insertTextBean.getIsBold()) {
                        textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                    }
                    if (insertTextBean.getSingleLine()) {
                        SVGADynamicEntity mSVGAEntity = getMSVGAEntity();
                        if (mSVGAEntity != null) {
                            String key = insertTextBean.getKey();
                            spannedFromHtml.getClass();
                            mSVGAEntity.setDynamicText(key, new BoringLayoutBean(spannedFromHtml, textPaint, insertTextBean.getAlignType(), insertTextBean.m223812getEllipsize()));
                        }
                    } else {
                        SVGADynamicEntity mSVGAEntity2 = getMSVGAEntity();
                        if (mSVGAEntity2 != null) {
                            String key2 = insertTextBean.getKey();
                            spannedFromHtml.getClass();
                            mSVGAEntity2.setDynamicText(key2, new StaticLayoutBean(spannedFromHtml, textPaint, insertTextBean.getAlignType()));
                        }
                    }
                } else if (!TextUtils.isEmpty(insertTextBean.getText())) {
                    TextPaint textPaint2 = new TextPaint();
                    textPaint2.setTypeface(insertTextBean.getTypeFace());
                    textPaint2.setColor(insertTextBean.getTextColor());
                    textPaint2.setTextSize(insertTextBean.getTextSize());
                    if (insertTextBean.getIsBold()) {
                        textPaint2.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                    }
                    if (insertTextBean.getSingleLine()) {
                        SVGADynamicEntity mSVGAEntity3 = getMSVGAEntity();
                        if (mSVGAEntity3 != null) {
                            mSVGAEntity3.setDynamicText(insertTextBean.getKey(), new BoringLayoutBean(insertTextBean.getText(), textPaint2, insertTextBean.getAlignType(), insertTextBean.m223812getEllipsize()));
                        }
                    } else {
                        SVGADynamicEntity mSVGAEntity4 = getMSVGAEntity();
                        if (mSVGAEntity4 != null) {
                            mSVGAEntity4.setDynamicText(insertTextBean.getKey(), new StaticLayoutBean(insertTextBean.getText(), textPaint2, insertTextBean.getAlignType()));
                        }
                    }
                }
            }
        }
    }

    public final void loadSVGAAnimWithListener(@Nullable String url, int loop, @Nullable SVGAAnimListenerAdapter animListener, boolean autoPlay) {
        if (getIsAnimating()) {
            stopAnimation();
        }
        this.mStopPlay = false;
        setLoops(loop);
        this.mResourceUrl = url;
        setAutoPlay(autoPlay);
        setCallback(animListener);
        loadSVGA();
    }

    @Override // com.immomo.svgaplayer.SVGAImageView, com.immomo.svgaplayer.SVGAParser.ParseCompletion
    public void onComplete(@NotNull SVGAVideoEntity videoItem) {
        String str;
        videoItem.getClass();
        if (this.mStopPlay) {
            return;
        }
        this.loadStart = false;
        if (getAddCache() && (str = this.mResourceUrl) != null) {
            SVGAEntityCacheLoader.INSTANCE.get().addCache(str, videoItem);
        }
        SVGADynamicEntity mSVGAEntity = getMSVGAEntity();
        if (mSVGAEntity != null) {
            SVGADrawable sVGADrawable = new SVGADrawable(videoItem, mSVGAEntity);
            setImageDrawable(sVGADrawable);
            SVGAAnimListenerAdapter callBack = getCallBack();
            if (callBack != null) {
                callBack.onLoadSuccess(videoItem);
            }
            if (!getAutoPlay()) {
                sVGADrawable.setCleared$svgalibrary_release(false);
                return;
            }
            int i = this.startFrame;
            if (i != 0) {
                stepToFrame(i, true);
            } else if (Double.isNaN(this.stepToPercentage)) {
                startAnimation();
            } else {
                stepToPercentage(this.stepToPercentage, true);
            }
        }
    }

    @Override // com.immomo.svgaplayer.SVGAImageView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        clearInsertData();
        SVGAParser sVGAParser = this.mSVGAParser;
        if (sVGAParser != null) {
            sVGAParser.onDestroy();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.immomo.svgaplayer.SVGAImageView, com.immomo.svgaplayer.SVGAParser.ParseCompletion
    public void onError(@NotNull String error) {
        error.getClass();
        if (this.loadStart) {
            SVGAAnimListenerAdapter callBack = getCallBack();
            if (callBack != null) {
                callBack.loadResError(error);
            }
            this.loadStart = false;
        }
    }

    public final void setMResourceUrl(@Nullable String str) {
        this.mResourceUrl = str;
    }

    public final void setMStopPlay(boolean z) {
        this.mStopPlay = z;
    }

    public final void startSVGAAnim(@Nullable String url, int loop) {
        startSVGAAnimWithListener(url, loop, null);
    }

    public final void startSVGAAnimAndStepToFrame(@Nullable String url, int loop, @Nullable SVGAAnimListenerAdapter animListener, int startFrame) {
        startSVGAAnimWithListener(url, loop, animListener);
        this.startFrame = startFrame;
    }

    public final void startSVGAAnimAndStepToPercentage(@Nullable String url, int loop, @Nullable SVGAAnimListenerAdapter animListener, double stepToPercentage) {
        startSVGAAnimWithListener(url, loop, animListener);
        this.stepToPercentage = stepToPercentage;
    }

    public final void startSVGAAnimWithJson(@Nullable JSONObject jsonObject, int loop, @Nullable SVGAClickAreaListener itemClickAreaListener, @Nullable SVGAAnimListenerAdapter animListener) {
        if (jsonObject == null) {
            onError(ErrorConstant.INSTANCE.getERROR_MMSVGA_JSON());
            return;
        }
        String strOptString = jsonObject.optString("templateUrl");
        JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("itemslist");
        if (TextUtils.isEmpty(strOptString)) {
            onError(ErrorConstant.INSTANCE.getERROR_MMSVGA_RESURL());
            return;
        }
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(jSONObjectOptJSONObject.optString(Constants.KEY_KEY))) {
                    if (jSONObjectOptJSONObject.optBoolean("isClick")) {
                        if (itemClickAreaListener != null) {
                            setMItemClickAreaListener(itemClickAreaListener);
                            List<String> mClickKeyList = getMClickKeyList();
                            String strOptString2 = jSONObjectOptJSONObject.optString(Constants.KEY_KEY);
                            strOptString2.getClass();
                            mClickKeyList.add(strOptString2);
                        } else {
                            HashMap<String, String> map = this.mClickGoto;
                            String strOptString3 = jSONObjectOptJSONObject.optString(Constants.KEY_KEY);
                            strOptString3.getClass();
                            String strOptString4 = jSONObjectOptJSONObject.optString("action");
                            strOptString4.getClass();
                            map.put(strOptString3, strOptString4);
                        }
                    }
                    if (jSONObjectOptJSONObject.optInt("type") == 2 && !TextUtils.isEmpty(jSONObjectOptJSONObject.optString("imageUrl"))) {
                        InsertImgBean insertImgBean = new InsertImgBean();
                        String strOptString5 = jSONObjectOptJSONObject.optString(Constants.KEY_KEY);
                        strOptString5.getClass();
                        insertImgBean.setKey(strOptString5);
                        String strOptString6 = jSONObjectOptJSONObject.optString("imageUrl");
                        strOptString6.getClass();
                        insertImgBean.setImgUrl(strOptString6);
                        insertImgBean.setCircle(jSONObjectOptJSONObject.optBoolean("isCircle"));
                        insertImgBean.setRadius(jSONObjectOptJSONObject.optInt(Constants.KEY_RADIUS));
                        insertImgBean.getCorner().setBitmapFilletCorner(jSONObjectOptJSONObject.optInt("corner"));
                        this.mInsertImgSimList.add(insertImgBean);
                    } else if (jSONObjectOptJSONObject.optInt("type") == 1 && !TextUtils.isEmpty(jSONObjectOptJSONObject.optString("text"))) {
                        InsertTextBean insertTextBean = new InsertTextBean();
                        String strOptString7 = jSONObjectOptJSONObject.optString(Constants.KEY_KEY);
                        strOptString7.getClass();
                        insertTextBean.setKey(strOptString7);
                        String strOptString8 = jSONObjectOptJSONObject.optString("text");
                        strOptString8.getClass();
                        insertTextBean.setText(strOptString8);
                        String strOptString9 = jSONObjectOptJSONObject.optString("richText");
                        strOptString9.getClass();
                        insertTextBean.setRichText(strOptString9);
                        insertTextBean.setTextColor(Color.parseColor(jSONObjectOptJSONObject.optString("textColor")));
                        insertTextBean.setTextSize(jSONObjectOptJSONObject.optInt("textSize"));
                        insertTextBean.setBold(jSONObjectOptJSONObject.optBoolean("isBold"));
                        insertTextBean.setTextAlignType(jSONObjectOptJSONObject.optInt("textAlignType"));
                        insertTextBean.setSingleLine(jSONObjectOptJSONObject.optBoolean("singleLine"));
                        insertTextBean.setEllipsize(jSONObjectOptJSONObject.optInt("ellipsize"));
                        this.mInsertTextSimList.add(insertTextBean);
                    }
                }
            }
        }
        startSVGAAnimWithListener(strOptString, loop, animListener);
    }

    public final void startSVGAAnimWithListener(@Nullable String url, int loop, @Nullable SVGAAnimListenerAdapter animListener) {
        loadSVGAAnimWithListener(url, loop, animListener, true);
    }

    public final void startSVGAAnimWithRange(@Nullable String url, int loop, int startFrame, int endFrame, @Nullable SVGAAnimListenerAdapter animListener) {
        setMStartFrame(startFrame);
        setMEndFrame(endFrame);
        startSVGAAnimWithListener(url, loop, animListener);
    }

    public final void stopAnimCompletely() {
        this.mStopPlay = true;
        stopAnimation(true);
    }

    public MomoSVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mInsertImgSimList = new ArrayList();
        this.mInsertTextSimList = new ArrayList();
        this.mClickGoto = new HashMap<>();
        this.stepToPercentage = DoubleCompanionObject.INSTANCE.m87479a();
    }

    public MomoSVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mInsertImgSimList = new ArrayList();
        this.mInsertTextSimList = new ArrayList();
        this.mClickGoto = new HashMap<>();
        this.stepToPercentage = DoubleCompanionObject.INSTANCE.m87479a();
    }

    public MomoSVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mInsertImgSimList = new ArrayList();
        this.mInsertTextSimList = new ArrayList();
        this.mClickGoto = new HashMap<>();
        this.stepToPercentage = DoubleCompanionObject.INSTANCE.m87479a();
    }

    @NotNull
    public final MomoSVGAImageView insertClickArea(@Nullable List<String> clickKeyList, @Nullable SVGAClickAreaListener itemClickAreaListener) {
        if (clickKeyList != null) {
            getMClickKeyList().addAll(clickKeyList);
        }
        if (itemClickAreaListener != null) {
            setMItemClickAreaListener(itemClickAreaListener);
        }
        return this;
    }

    @NotNull
    public final MomoSVGAImageView insertClickArea(@Nullable String clickKey, @Nullable SVGAClickAreaListener itemClickAreaListener) {
        if (clickKey != null) {
            getMClickKeyList().add(clickKey);
        }
        if (itemClickAreaListener != null) {
            setMItemClickAreaListener(itemClickAreaListener);
        }
        return this;
    }

    public final void startSVGAAnimWithJson(@Nullable String jsonStr, int loop, @Nullable SVGAClickAreaListener itemClickAreaListener, @Nullable SVGAAnimListenerAdapter animListener) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(jsonStr)) {
            onError(ErrorConstant.INSTANCE.getERROR_MMSVGA_JSON());
            return;
        }
        try {
            jSONObject = new JSONObject(jsonStr);
        } catch (Exception unused) {
            onError(ErrorConstant.INSTANCE.getERROR_MMSVGA_JSON());
            jSONObject = null;
        }
        if (jSONObject != null) {
            startSVGAAnimWithJson(jSONObject, loop, itemClickAreaListener, animListener);
        }
    }
}

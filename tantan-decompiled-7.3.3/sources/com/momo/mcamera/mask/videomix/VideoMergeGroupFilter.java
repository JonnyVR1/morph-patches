package com.momo.mcamera.mask.videomix;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.FileUtil;
import com.momo.mcamera.mask.Sticker;
import java.io.File;
import p153l.ogk;
import p153l.omw;
import p153l.qv40;
import p153l.suf;

/* JADX INFO: loaded from: classes8.dex */
public class VideoMergeGroupFilter extends ogk implements suf, IVideoResourceInputListener.RenderTimestampListener, OnFaceUpdateListener {
    private long duration;
    private FaceCutFilter faceCutFilter;
    private IVideoTimeoutListener listener;
    private qv40 normalFilter;
    private long startTime;
    private VideoMaskFilter videoMaskFilter;
    private VideoMergeFilter videoMergeFilter;
    private VideoResourceFilter videoResourceFilter;
    private long videoTimestamp = -1;

    public VideoMergeGroupFilter(Context context, String str, Sticker.VideoFileConfig videoFileConfig, long j) {
        this.duration = 0L;
        this.startTime = 0L;
        this.useCache = false;
        qv40 qv40Var = new qv40();
        this.normalFilter = qv40Var;
        qv40Var.useCache = false;
        FaceCutFilter faceCutFilter = new FaceCutFilter();
        this.faceCutFilter = faceCutFilter;
        faceCutFilter.useCache = false;
        faceCutFilter.setOnVertexCoordinateUpdateListener(this);
        VideoResourceFilter videoResourceFilter = new VideoResourceFilter(context, str + File.separator + videoFileConfig.getVideo(), videoFileConfig.getFrameRateToPlay());
        this.videoResourceFilter = videoResourceFilter;
        videoResourceFilter.useCache = false;
        videoResourceFilter.setRenderTimestampListener(this);
        VideoMaskFilter videoMaskFilter = new VideoMaskFilter();
        this.videoMaskFilter = videoMaskFilter;
        videoMaskFilter.useCache = false;
        VideoMergeFilter videoMergeFilter = new VideoMergeFilter();
        this.videoMergeFilter = videoMergeFilter;
        videoMergeFilter.useCache = false;
        this.normalFilter.addTarget(this.faceCutFilter);
        this.normalFilter.addTarget(this.videoResourceFilter);
        this.normalFilter.addTarget(this.videoMaskFilter);
        this.videoMergeFilter.registerFilterLocation(this.faceCutFilter, 0);
        this.videoMergeFilter.registerFilterLocation(this.videoResourceFilter, 1);
        this.videoMergeFilter.registerFilterLocation(this.videoMaskFilter, 2);
        this.faceCutFilter.addTarget(this.videoMergeFilter);
        this.videoResourceFilter.addTarget(this.videoMergeFilter);
        this.videoMaskFilter.addTarget(this.videoMergeFilter);
        this.videoMergeFilter.addTarget(this);
        registerInitialFilter(this.normalFilter);
        registerFilter(this.faceCutFilter);
        registerFilter(this.videoResourceFilter);
        registerFilter(this.videoMaskFilter);
        registerTerminalFilter(this.videoMergeFilter);
        setVideoFileConfig(str, videoFileConfig);
        this.duration = j <= 0 ? Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS : j;
        this.startTime = System.currentTimeMillis();
    }

    private void setVideoFileConfig(String str, Sticker.VideoFileConfig videoFileConfig) {
        if (videoFileConfig == null || !FileUtil.exist(str)) {
            return;
        }
        FaceCutFilter faceCutFilter = this.faceCutFilter;
        if (faceCutFilter != null) {
            faceCutFilter.setVideoFileConfig(videoFileConfig.getTimeStamp(), videoFileConfig.getFaceData());
        }
        VideoMaskFilter videoMaskFilter = this.videoMaskFilter;
        if (videoMaskFilter != null) {
            videoMaskFilter.setVideoFileConfig(videoFileConfig.getMaskBorder(), str + File.separator + videoFileConfig.getMaskImage());
        }
        if (this.videoMaskFilter != null) {
            this.videoMergeFilter.setVideoFileConfig(videoFileConfig.getType());
        }
    }

    @Override // p153l.ogk, p153l.gfj, p153l.wej
    public synchronized void destroy() {
        super.destroy();
        this.faceCutFilter.setOnVertexCoordinateUpdateListener(null);
        this.videoResourceFilter.setRenderTimestampListener(null);
        this.videoTimestamp = -1L;
    }

    @Override // com.momo.mcamera.mask.videomix.OnFaceUpdateListener
    public void onFaceUpdate(float[] fArr, float f) {
        VideoMaskFilter videoMaskFilter = this.videoMaskFilter;
        if (videoMaskFilter != null) {
            videoMaskFilter.updateVertexCoordinate(fArr);
            this.videoMaskFilter.updateMaskRoll(f);
        }
    }

    @Override // com.momo.mcamera.mask.videomix.IVideoResourceInputListener.RenderTimestampListener
    public void onRenderTimestampChanged(long j) {
        if (System.currentTimeMillis() - this.startTime > this.duration) {
            IVideoTimeoutListener iVideoTimeoutListener = this.listener;
            if (iVideoTimeoutListener != null) {
                iVideoTimeoutListener.onTimeout();
                return;
            }
            return;
        }
        this.videoTimestamp = j;
        FaceCutFilter faceCutFilter = this.faceCutFilter;
        if (faceCutFilter != null) {
            faceCutFilter.updateTimestamp(j);
        }
    }

    @Override // p153l.suf
    public void setMMCVInfo(omw omwVar) {
        if (this.videoTimestamp <= 0) {
            return;
        }
        VideoMergeFilter videoMergeFilter = this.videoMergeFilter;
        if (videoMergeFilter != null) {
            videoMergeFilter.setMMCVInfo(omwVar);
        }
        FaceCutFilter faceCutFilter = this.faceCutFilter;
        if (faceCutFilter != null) {
            faceCutFilter.setMMCVInfo(omwVar);
        }
    }

    public void setOnVideoTimeoutListener(IVideoTimeoutListener iVideoTimeoutListener) {
        this.listener = iVideoTimeoutListener;
    }
}

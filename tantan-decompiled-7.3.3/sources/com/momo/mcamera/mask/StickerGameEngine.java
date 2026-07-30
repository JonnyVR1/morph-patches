package com.momo.mcamera.mask;

import android.graphics.PointF;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.momo.mcamera.mask.delegate.GameScoreListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class StickerGameEngine {
    private List<Float> notUsedTrajectory;
    private List<Float> usedTrajectory;
    public int stickerNumbers = 5;
    public int columnNumber = 10;
    private int stickerGroupCount = 0;
    private int mCoreNumber = 0;
    float mousePosLeftTopX = 0.0f;
    float mousePosLeftTopY = 0.0f;
    float mousePosRightBottomY = 0.0f;
    float mousePosRightBottomX = 0.0f;
    private int imageWidth = 0;
    private int imageHeight = 0;
    private float srcImageWidthScaleRatio = 0.0f;
    private float srcImageHeightScaleRatio = 0.0f;
    private float stickWidthScaleRatio = 0.8f;
    private float stickHeightScaleRatio = 0.8f;
    public List<StickerGameItem> stickerItemList = new ArrayList();
    public List<Trajectory> trajectoryList = new ArrayList();

    public class Trajectory {
        int bindStickerGroup;
        int coreNumber;
        float duration;
        long startTime;
        float velocity;
        float xPosition;
        float yPosition;
        float yPositionOffset;
        boolean isFixed = false;
        int fixedFrames = 0;
        int maxFixFrames = 0;
        boolean needRandomStickerGroup = false;
        boolean isTriggered = false;

        public Trajectory() {
            StickerGameEngine.access$008(StickerGameEngine.this);
            int i = StickerGameEngine.this.mCoreNumber;
            this.coreNumber = i;
            this.yPositionOffset = i * (-0.15f);
        }

        public void reset() {
            if (this.needRandomStickerGroup) {
                this.bindStickerGroup = (int) ((Math.random() * 10.0d) % ((double) StickerGameEngine.this.stickerGroupCount));
            }
            int i = this.coreNumber + 1;
            this.coreNumber = i;
            if (i > 5) {
                this.coreNumber = 1;
            }
            this.maxFixFrames = StickerGameEngine.this.stickerItemList.get((this.bindStickerGroup * 2) + 1).sticker.getFrameNumber();
            this.fixedFrames = 0;
            this.isFixed = false;
            this.duration = 0.0f;
            this.xPosition = (float) Math.random();
            if (StickerGameEngine.this.notUsedTrajectory.size() > 0) {
                Float f = (Float) StickerGameEngine.this.notUsedTrajectory.get(((int) (Math.random() * 10.0d)) % StickerGameEngine.this.notUsedTrajectory.size());
                this.xPosition = f.floatValue();
                StickerGameEngine.this.notUsedTrajectory.remove(f);
                StickerGameEngine.this.usedTrajectory.add(f);
            }
            float f2 = StickerGameEngine.this.stickerItemList.get(this.bindStickerGroup * 2).downVelocity;
            this.velocity = f2;
            if (this.isTriggered) {
                int i2 = this.coreNumber;
                this.yPositionOffset = ((i2 + 1) * (-0.1f)) / 2.0f;
                this.velocity = (float) (((double) f2) - (((double) i2) * 0.05d));
            }
            this.isTriggered = false;
            this.yPosition = this.yPositionOffset;
            this.startTime = 0L;
        }
    }

    public StickerGameEngine() {
        for (int i = 0; i < this.stickerNumbers; i++) {
            generateNewTrajectory(i);
        }
    }

    public static /* synthetic */ int access$008(StickerGameEngine stickerGameEngine) {
        int i = stickerGameEngine.mCoreNumber;
        stickerGameEngine.mCoreNumber = i + 1;
        return i;
    }

    private void generateTrajectoryXPosition() {
        List<Float> list = this.notUsedTrajectory;
        if (list == null) {
            this.notUsedTrajectory = new ArrayList();
            this.usedTrajectory = new ArrayList();
        } else {
            list.clear();
            this.usedTrajectory.clear();
        }
        if (this.notUsedTrajectory != null) {
            float f = this.srcImageWidthScaleRatio;
            if (f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                float f2 = ((1.0f - f) / 2.0f) + 0.15f;
                float f3 = (1.0f - (2.0f * f2)) / this.columnNumber;
                for (int i = 0; i < this.columnNumber; i++) {
                    f2 += f3;
                    this.notUsedTrajectory.add(new Float(f2));
                }
            }
        }
    }

    private boolean isTriggerRegionMatches(StickerGameItem stickerGameItem, Trajectory trajectory) {
        float f = trajectory.xPosition * this.imageWidth;
        float f2 = trajectory.yPosition * this.imageHeight;
        if (this.mousePosLeftTopX < f && this.mousePosRightBottomX > f && this.mousePosRightBottomY > f2 && this.mousePosLeftTopY < f2) {
            if (!stickerGameItem.isGameLive) {
                trajectory.isTriggered = true;
                stickerGameItem.startPlay();
                GameScoreListener gameScoreListener = stickerGameItem.gameScoreListener;
                if (gameScoreListener != null && !stickerGameItem.isGameLive) {
                    gameScoreListener.onItemTriggered(stickerGameItem.sticker.getAdditionalInfo().getGameScore());
                }
            }
            trajectory.isFixed = true;
            for (int i = 0; i < this.usedTrajectory.size(); i++) {
                Float f3 = this.usedTrajectory.get(i);
                if (f3.floatValue() == trajectory.xPosition) {
                    this.usedTrajectory.remove(i);
                    this.notUsedTrajectory.add(f3);
                    break;
                }
            }
        }
        return true;
    }

    public void addSticker(StickerGameItem stickerGameItem) {
        if (stickerGameItem.sticker.isGameSticker) {
            this.stickerItemList.add(stickerGameItem);
            if (stickerGameItem.isGameLive) {
                this.stickerGroupCount++;
            }
        }
    }

    public void generateNewTrajectory(int i) {
        Trajectory trajectory = new Trajectory();
        trajectory.bindStickerGroup = i;
        this.trajectoryList.add(trajectory);
    }

    public float getAdjustHeightScale() {
        int i = this.imageHeight;
        if (i == 640.0f) {
            return 1.0f;
        }
        return (i * 1.0f) / 640.0f;
    }

    public void setGameScoreListener(GameScoreListener gameScoreListener) {
        Iterator<StickerGameItem> it = this.stickerItemList.iterator();
        while (it.hasNext()) {
            it.next().setGameScoreListener(gameScoreListener);
        }
    }

    public void setImageHeight(int i) {
        this.imageHeight = i;
    }

    public void setImageWidth(int i) {
        this.imageWidth = i;
    }

    public void setSrcImageHeightScaleRatio(float f) {
        this.srcImageHeightScaleRatio = f;
    }

    public void setSrcImageWidthScaleRatio(float f) {
        if (this.srcImageWidthScaleRatio != f) {
            this.srcImageWidthScaleRatio = f;
            generateTrajectoryXPosition();
        }
    }

    public synchronized void setTimeStamp(long j) {
        try {
            if (this.notUsedTrajectory != null && this.imageWidth != 0) {
                updateTrajectory(j);
                for (Trajectory trajectory : this.trajectoryList) {
                    for (StickerGameItem stickerGameItem : this.stickerItemList) {
                        if (stickerGameItem.sticker.groupNumber == trajectory.bindStickerGroup) {
                            boolean z = trajectory.isFixed;
                            if (!z || stickerGameItem.isGameLive) {
                                if (z || !stickerGameItem.isGameLive) {
                                }
                            }
                            if (!trajectory.isTriggered) {
                                isTriggerRegionMatches(stickerGameItem, trajectory);
                            }
                            float adjustHeightScale = getAdjustHeightScale() * 2.0f;
                            this.stickWidthScaleRatio = 0.1f;
                            stickerGameItem.setParamForMatrix(adjustHeightScale * 0.1f, adjustHeightScale * 0.1f, new PointF(trajectory.xPosition, trajectory.yPosition), 0.0f);
                        }
                    }
                }
                this.mousePosLeftTopX = 0.0f;
                this.mousePosLeftTopY = 0.0f;
                this.mousePosRightBottomY = 0.0f;
                this.mousePosRightBottomX = 0.0f;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void updateTrajectory(long j) {
        for (Trajectory trajectory : this.trajectoryList) {
            if (trajectory.startTime == 0) {
                trajectory.startTime = j;
            }
            if (trajectory.fixedFrames == trajectory.maxFixFrames) {
                int size = this.stickerItemList.size();
                int i = trajectory.bindStickerGroup;
                if (size > i * 2) {
                    this.stickerItemList.get((i * 2) + 1).sticker.curIndex = 0;
                    trajectory.reset();
                } else {
                    trajectory.needRandomStickerGroup = true;
                    trajectory.reset();
                }
            }
            float f = (j - trajectory.startTime) / 1000.0f;
            trajectory.duration = f;
            if (trajectory.isFixed) {
                trajectory.fixedFrames++;
            } else {
                if (f > 0.0f) {
                    trajectory.yPosition = trajectory.yPositionOffset + (trajectory.velocity * f);
                }
                if (trajectory.yPosition > 1.1d) {
                    for (int i2 = 0; i2 < this.usedTrajectory.size(); i2++) {
                        Float f2 = this.usedTrajectory.get(i2);
                        if (f2.floatValue() == trajectory.xPosition) {
                            this.usedTrajectory.remove(i2);
                            this.notUsedTrajectory.add(f2);
                            break;
                        }
                    }
                    trajectory.reset();
                }
            }
        }
    }

    public synchronized void updateTriggerStatus(float f, float f2, float f3, float f4) {
        this.mousePosLeftTopX = f;
        this.mousePosLeftTopY = f2;
        this.mousePosRightBottomX = f3;
        this.mousePosRightBottomY = f4;
    }
}

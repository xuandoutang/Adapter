package net.robinx.lib.adapter.recycler.anim.extra;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import net.robinx.lib.adapter.recycler.anim.AnimatorAdapter;

/**
 * An implementation of the AnimatorAdapter class which applies a
 * swing-in-from-the-left-animation to views.
 */
public class SlideInLeftAnimatorAdapter<T extends RecyclerView.ViewHolder> extends AnimatorAdapter<T> {

    private static final String TRANSLATION_X = "translationX";

    public SlideInLeftAnimatorAdapter(RecyclerView.Adapter<T> adapter,
                                      RecyclerView recyclerView) {
        super(adapter, recyclerView);
    }

    @NonNull
    @Override
    public Animator[] getAnimators(@NonNull View view) {
        return new Animator[]{ObjectAnimator.ofFloat(view, TRANSLATION_X, 0 - mRecyclerView.getLayoutManager().getWidth(), 0)};
    }
}